package CodeStatesAlgorithms;

public class NumberSearch { // str에서 숫자를 찾아 다 더하고 문자열의 (숫자와 공백을 제외한 나머지) 길이로 나누고 반올림하여 리턴하라.
    public int numberSearch(String str) {
        String str2 = "";
        double sum =0;
        for(int i=0; i<str.length(); i++){
            boolean isNum = false;
            for(int j=1; j<=10; j++){
                if(str.charAt(i)==j+'0'){
                    sum += str.charAt(i)-48;
                    isNum =true;
                    break;
                }
            }
            if(!isNum && !(str.charAt(i)==' ')) str2 += str.charAt(i);
        }


        int result = (int) Math.round(sum/str2.length());
        return result;
    }

    public int numberSearch2(String str) {
        String digits = "0123456789";

        if(str.length() == 0) return 0;

        double sum = 0;
        String pureStr = "";

        for(int i = 0; i < str.length(); i++) {
            if(digits.indexOf(str.charAt(i)) != -1) { //digits의 값에서 str[i]의 값이 포함되어 있다면 (cf. indefxOf는 값이 존재하면 해당 인덱스를, 없다면 -1을 리턴)
                sum = sum + Character.getNumericValue(str.charAt(i)); // Character.getNumericValue() >> 문자 -> int로 바꾸는 메서드
            } else if(str.charAt(i) != ' ') {
                pureStr = pureStr + str.charAt(i);
            }
        }
        double result = sum / pureStr.length();
        return (int) Math.round((result * 10) / 10);
    }
}
