package CodeStatesAlgorithms;

public class IfOddAddDash {
    public String insertDash(String str) { // 연속된 홀수 사이에 "-" 넣는 메서드

        if(str.length()==0) return null;

        String result = str;
        int count = 0;

        for(int i = 0; i < str.length()-1; i++) {
            if(isOdd(str.charAt(i)) && isOdd(str.charAt(i+1)) ){
                result = result.substring(0,i+1+count)+"-"+result.substring(i+1+count);
                count++;
            }
        }
        return result;
    }

    public boolean isOdd(char s){ // 홀수판별 메서드
        int num = s; // 문자 바로 int로 바뀌네..
        if(num%2==0){
            return false;
        }
        return true;

    }

    public String insertDash2(String str) { // 2번째 방법
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0); // 문자열로 변환하기 위해 "" 필요

        for(int i = 1; i < str.length(); i++) {
            int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
            if(preNumber != 0 && curNumber != 0) {
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}
