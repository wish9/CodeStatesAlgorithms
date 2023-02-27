package CodeStatesAlgorithms;

import java.util.ArrayList;

public class DfsSolution {
    public ArrayList<String> dfs(tree node) {
        ArrayList<String> result = new ArrayList<>();

        result.add(node.getValue());


        if(node.getChildrenNode()!=null){
            for(tree o : node.getChildrenNode()) {
                result.addAll(dfs(o));
            }
        }

        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
