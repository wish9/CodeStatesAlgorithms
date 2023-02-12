package CodeStatesAlgorithms;

public class CompressString {
    public String compressString(String str) { // 3회 이상 연속되는 문자or숫자만 압축
        String result ="";
        char now = ' ';
        int count = 1;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=now) { // before문자와 현재 문자가 다를경우
                now = str.charAt(i); // now를 현재 문자로 초기화
                char nextCh = ' ';
                int j = i;
                count = 1;
                if (j + 1 < str.length()) {
                    nextCh = str.charAt(j + 1);
                    while (now == nextCh) {
                        count++;
                        j++;
                        if (j + 1 < str.length()) nextCh = str.charAt(j + 1);
                        else break;
                    }
                }
                if(count<3) result += now;
                else result = result + count + now;
            }else if(count<3) result += now; // before문자와 현재 문자가 같더라도 count<3이면 추가

        }
        return result;
    }


    public String compressString2(String str) {
        if(str.length() == 0) return "";
        char before = str.charAt(0);
        int count = 1;
        String result = "";

        str = str + ' '; // 마지막 부분이 연속된 문자일 경우를 위해 dummy 문자 (인덱스 1 늘릴 목적으로 공백) 추가
        for (int i = 1; i < str.length(); i++) {
            if (before == str.charAt(i)) { // 동일한 문자가 반복될 경우
                count++;
            } else { // 이전과 다른 문자일 경우
                if (count >= 3) { // 반복된 횟수가 3 이상일 경우
                    result = result + count + before;
                } else { // 반복 횟수가 3 이하일 경우
                    for(int j = 0; j < count; j++) { //count의 수만큼 결과에 문자열을 저장
                        result = result + before;
                    }
                    //result = result + Character.toString(before).repeat(count);  //String.repeat메소드를 활용하면 더 간단하게 작성 가능
                }
                before = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}
