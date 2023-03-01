package CodeStatesAlgorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BfsSolution {
    public ArrayList<String> bfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        Queue<tree> queue = new LinkedList<>();
        ArrayList<Boolean> isvisited = new ArrayList<>();
        int num = 2;
        queue.add(node);
        result.add(node.getValue());
        tree s = node;
        isvisited.add(true);

        while (queue.size() != 0) {
            s = queue.poll();
            //result.add(s.getValue());
            if(s.getChildrenNode()==null) {
                //result.add(s.getValue());
                continue;
            }
            Iterator<tree> i = new LinkedList<>(s.getChildrenNode()).iterator();
            while (i.hasNext()) {
                tree n = i.next();
                if (isvisited.size()<num) {
                    queue.add(n);
                    result.add(n.getValue());
                    num++;
                    isvisited.add(true);
                }
            }
        }


        return result;
    }

    public ArrayList<String> bfs2(tree node) { // 방문처리 굳이 안하고 이렇게 해도 된다.
        Queue<tree> queue = new LinkedList<>();
        ArrayList<String> values = new ArrayList<>();
        queue.add(node);

        while(queue.size() > 0) {
            tree curNode = queue.poll();

            values.add(curNode.getValue());

            if(curNode.getChildrenNode() != null) {
                queue.addAll(curNode.getChildrenNode());
            }
        }
        return values;
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
