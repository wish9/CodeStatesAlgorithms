package CodeStatesAlgorithms;

import java.util.Arrays;

public class DoubleSpaceToSingle {

        public String convertDoubleSpaceToSingle(String str) {
            str = str.replaceAll("  ", " "); // 공백 2개를 1개로 바꾸기
            return str;
        }

        public String convertDoubleSpaceToSingle2(String str) {
            String[] words = str.split("  ");
            System.out.println(Arrays.toString(words));
            return String.join(" ", words);
        }

        public String convertDoubleSpaceToSingle3(String str) {
            String result = "";
            char before = 0;

            for(int i = 0; i < str.length(); i++) {
              if(str.charAt(i) != ' ' || before != ' ') {
                  result += str.charAt(i);
              }
              before = str.charAt(i);
            }
        return result;
        }

}
