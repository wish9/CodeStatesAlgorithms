package CodeStatesAlgorithms;

import java.util.Arrays;
import java.util.regex.Pattern;

import static java.lang.Character.isLowerCase;

public class LetterCapitalize {
    public String letterCapitalize(String str) {

        if(str=="") return str;

//        while(str.contains("  ")){ // 중복된 공백 제거
//            str = str.replaceAll("  ", " "); // 공백 2개를 1개로 바꾸기
//        }
        String result = "";
        String[] strChange1 = str.split("\\s"); // 띄어쓰기 기준으로 단어 분리, 배열로 저장
        String strChange2 = "";

        for(int i=0; i<strChange1.length; i++){ // 단어 하나씩 반복문 실행
            //strChange1[i] = strChange1[i].replace(" ", ""); // i번째 단어에 공백 남아있으면 공백 제거 trim()써도 됨. //공백기준으로 split 했기 때문에 빈배열 자체가 하나의 배열요소로 들어갔다.
            if(strChange1[i].equals("")){ //공백은 그대로 공백 출력하게 나눠주기
                strChange2 = strChange1[i];
            }else{
                strChange2 = strChange1[i].substring(0, 1).toUpperCase() + strChange1[i].substring(1);
            }

            if (result == "") result = strChange2;
            else result = result + " " + strChange2; //String.join쓰면 조금 더 간단히 가능
        }
        return result;
    }
}
