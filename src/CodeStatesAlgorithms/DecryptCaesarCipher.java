package CodeStatesAlgorithms;

public class DecryptCaesarCipher { // 카이사르 암호(Caesar cipher)를 복호화 하라.
    public String decryptCaesarCipher(String str, int secret) {
        String result = "";
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==' '){ // 공백일 경우 그대로 공백 추가
                result += ' ';
            }else{
                char add = str.charAt(i);
                if(alp.indexOf(add)-secret>=0){ //문자열의 index를 벗어날 경우를 고려해서 범위를 나눠 줌
                    result += alp.charAt(alp.indexOf(add)-secret);
                }else{
                    result += alp.charAt(alp.length()-Math.abs(alp.indexOf(add)-secret));
                }
            }
        }

        return result;
    }

    public String decryptCaesarCipher2(String str, int secret) {
        String result = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                result = result + str.charAt(i);
            } else {
                int asis = alpha.indexOf(str.charAt(i));
                int tobe = (asis - secret + alpha.length()) % alpha.length(); // 범위를 나누지 않고 이렇게도 가능
                result = result + alpha.charAt(tobe);
            }
        }
        return result;
    }
}
