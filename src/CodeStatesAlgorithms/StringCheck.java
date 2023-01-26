package CodeStatesAlgorithms;

public class StringCheck {
    public boolean ABCheck(String str) {
        boolean A = (str.length() == 5 && str.charAt(0) == 'a' && str.charAt(str.length() - 1) == 'b');
        boolean B = (str.length() == 5 && str.charAt(0) == 'b' && str.charAt(str.length() - 1) == 'a');

        if (A || B) return true;
        else if (str.length()==0) return false;
        else{
            int aIndex = str.toLowerCase().indexOf('a');
            int bIndex = str.toLowerCase().indexOf('b');

            if(aIndex!=-1 && bIndex!=-1) { // a,b둘 다 존재할 경우
                if(Math.abs(aIndex-bIndex)==4) return true;
                else{
                    for(int i=0; i<=str.length()-5; i++){
                        String str2 = str.substring(i,i+5).toLowerCase();
                        boolean AA = (str2.charAt(0) == 'a' && str2.charAt(4) == 'b');
                        boolean BB = (str2.charAt(0) == 'b' && str2.charAt(4) == 'a');
                        if(AA||BB) return true;
                    }
                }
            }
        }

        return false;
    }
}
