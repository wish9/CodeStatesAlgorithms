package CodeStatesAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Subset { // 각 문자를 가지고 만들 수 있는 모든 부분집합을 구해라
    public ArrayList<String> powerSet(String str) {
        ArrayList<String> result = new ArrayList<>();

        String deduplication = "";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String str2 = new String(chars); // 문자열 정렬

        for (int i = 0; i < str2.length(); i++) { // 중복 제거
            if(str2.indexOf(str2.charAt(i)) == i) deduplication += str2.charAt(i);
        }

        result=pSet(result, deduplication);

        result.add("");

        Collections.sort(result);
        return result;
    }

    public ArrayList<String> pSet(ArrayList<String> list, String str){


        if(str.length()==1) {
            list.add(str.charAt(0)+"");
            return list;
        }

        list.addAll(pSet(list, str.substring(1,str.length())));
        for(int i=1; i<list.size()/2+1; i++) {
            list.set(i, str.charAt(0)+list.get(i));
            System.out.println(Arrays.toString(list.toArray()));
        }
        list.add(str.charAt(0)+"");
        return list;
    }
}
