package CodeStatesAlgorithms;

import java.lang.reflect.Array;
import java.util.*;

public class BalancedBrackets { // 괄호의 짝이 맞는지 확인하라.
    public boolean balancedBrackets(String str) {

        if (str == null || str.equals("")) return true;

        str = str.replaceAll("[^\\[\\]{}\\(\\)]", ""); // 괄호를 제외한 문자 삭제

        char[] open = {'[', '{', '('};
        char[] close = {']', '}', ')'};

        for (int j=0; j<3; j++) {

            List<Integer> openList = new ArrayList<>();
            List<Integer> closeList = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==open[j]) openList.add(i);
                else if(str.charAt(i)==close[j]) closeList.add(i);
            }

            if(openList.size() != closeList.size()) return false; // 열린괄호와 닫힌괄호의 갯수가 다르면 return false

            while (openList.size()!=0 && closeList.size()!=0){
                int openMax = Collections.max(openList);
                int closeMax = Collections.max(closeList);
                if(openMax>closeMax) return false; // 열린 괄호로 끝나면 false

                int sltom = 0;// smallestLargerThanOpenMax의 약자

                for (int value : closeList) {
                    if (value > openMax) { // openMax보다 큰 값들 중
                        if (sltom == 0 || value < sltom) { // 가장 작은 값 찾기
                            sltom = value;
                        }
                    }
                }
                if( sltom-openMax!=1 && !balancedBrackets(str.substring(openMax+1, sltom))) return false; // 연결된 괄호 사이의 문자열이 괄호가 짝지어져 있지 않으면 false
                openList.remove(Integer.valueOf(openMax));
                closeList.remove(Integer.valueOf(sltom));
            }
        }
        return true;
    }

    public boolean balancedBrackets2(String str) {
        Stack<Character> stack = new Stack<>(); // 먼저 들어간 요소가 나중에 나오는 stack을 활용
        HashMap<Character, Character> opener = new HashMap<>();
        opener.put('{', '}');
        opener.put('[', ']');
        opener.put('(', ')');

        String closer = "}])";

        for(int i = 0; i < str.length(); i++) {
            if(opener.containsKey(str.charAt(i))) { // 열린괄호일 경우
                stack.push(str.charAt(i)); // stack에 추가
            } else if(closer.indexOf(str.charAt(i)) != -1 && stack.size() > 0) { //닫힌괄호이며 스택이 비어있지 않은 경우 즉, 열린괄호가 나온 이후에 닫힌괄호가 나온 경우
                char top = stack.pop();
                char pair = opener.get(top);
                if(pair != str.charAt(i)) { // 다른 종류의 닫힌 괄호가 나오면 false
                    return false;
                }
            } else { // stack이 비어있는데 닫힌 괄호가 나왔다? = false
                return false;
            }
        }
        return stack.size() == 0; // 남는 stack이 있다면 짝지지지 못하는 괄호가 남은거니 false 남은게 없이 위 과정을 거치면 다 제대로 짝지어진 것이니 true
    }

    public boolean balancedBrackets3(String str) {
        if (str == null || str.equals("")) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') { // 열린괄호면 stack에 담아두고
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') { // 단힌괄호면 담겨져 있는 열린괄호가 있는지 확인
                if (stack.isEmpty()) { // 없으면 false
                    return false;
                }
                char top = stack.pop(); // 있으면 저장해둔 열린괄호 꺼내서
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) { // 열린괄호가 시작되면, 이후로 다른 종류의 닫힌 괄호가 바로 나올 수 없다.
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
