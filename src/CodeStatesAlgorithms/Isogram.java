package CodeStatesAlgorithms;

import java.util.HashMap;

public class Isogram {
    public boolean isIsogram(String str) { // 각 알파벳을 한번씩만 이용해서 만든 단어나 문구인지 판단하는 메서드
        String str2 = str.toUpperCase(); //입력된 전체 문자열을 모두 소문자로 변환

        for(int i=0; i<str2.length()-1; i++){  // 뒤에 있는 인덱스값들과 하나씩 비교
            for(int j=i+1; j<str2.length(); j++){
                if(str2.charAt(i)==str2.charAt(j)) return false;
            }
        }
        return true;
    }

    public boolean isIsogram2(String str) { // 두번째 방법
        if(str.length() == 0) return true; //입력된 문자열이 공백일 경우 true를 리턴

        HashMap<Character, String> cache = new HashMap<Character, String>(); //사용된 알파벳을 저장할 HashMap을 선언

        str = str.toLowerCase(); //입력된 전체 문자열을 모두 소문자로 변환

        for(int i = 0; i < str.length(); i++) {
            if(cache.containsKey(str.charAt(i))) { //HashMap에 이미 해당 알파벳이 저장되어 있다면 false 출력
                return false;
            }
            cache.put(str.charAt(i), "Exists"); // //HashMap에 해당 문자열이 저장되어 있지 않다면, 저장
        }
        return true;
    }
}
