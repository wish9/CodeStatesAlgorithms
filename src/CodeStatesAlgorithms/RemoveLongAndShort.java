package CodeStatesAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveLongAndShort {
    public String[] removeExtremes(String[] arr) { // 가장 짧은 문자열, 가장 긴 문자열 삭제
        if(arr.length==0) return null;

        int shortLength = arr[0].length();
        int longLength = arr[0].length();

        for(String o: arr){ // 가장 작고 큰 문자열 길이 구하기
            int now = o.length();
            if(!o.equals(arr[0])){
                shortLength = Math.min(now,shortLength);
                longLength = Math.max(now,longLength);
            }
        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        for(int i=0; i<list.size(); i++){
            if(list.get(list.size()-i-1).length()==shortLength){ //역순으로 탐색하기 위해 -i 사용
                list.remove(list.size()-i-1);
                break;
            }
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(list.size()-i-1).length()==longLength){ //역순으로 탐색하기 위해 -i 사용
                list.remove(list.size()-i-1);
                break;
            }
        }

        String[] arr2 = new String[list.size()];   // list를 array로 바꾸는 방법
        return list.toArray(arr2);


//        String[] result = Arrays.stream(arr)
//                .filter(x -> x.length()==shortLength)  // stream.filter 조건식에는 변수 사용이 안되나??
//                .filter(y ->y.equals(arr[longIndex]))  // 똑같은 문자를 갖는 요소가 없다는 가정이 있어야 쓸 수 있는 방법
//                .toArray();
    }

    public String[] removeExtremes2(String[] arr) {
        if(arr.length == 0) return null; //입력된 문자열이 공백일때 null을 리턴
        int shortestLen = 20; //최대 길이는 20, 최소 길이는 0으로 기본값을 설정 (문제에서 각요소의 최대길이는 20이라고 주어짐)
        int longestLen = 0; //가장 작은 인덱스와 가장 긴 문자열의 인덱스를 찾기위해 0으로 기본값을 설정
        int shortestIdx = 0; // 가장 짧은 요소 인덱스 저장용
        int longestIdx = 0; // 가장 긴 요소 인덱스 저장용

        for (int i = 0; i < arr.length; i++) { //가장 긴요소와 짧은 요소의 인덱스와 길이를 찾아서 저장
            if (arr[i].length() >= longestLen) {
                longestLen = arr[i].length();
                longestIdx = i;
            }
            if (arr[i].length() <= shortestLen) {
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
        }

        String[] result = new String[arr.length - 2]; // 결과 담을용으로 배열 생성
        int curIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != shortestIdx && i != longestIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }
        return result;
    }
}
