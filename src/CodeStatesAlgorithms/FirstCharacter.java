package CodeStatesAlgorithms;

public class FirstCharacter {
    public String firstCharacter(String str) { //문자열의 단어별(공백으로 구분) 첫문자 출력하기
        String result = "";
        String[] strA = str.split(" ");
        if(str.length()==0) return "";

        for(int i =0; i<strA.length; i++) {
            result += strA[i].charAt(0);
        }
        return result;
    }
}
