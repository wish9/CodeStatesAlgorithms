package CodeStatesAlgorithms;

public class ReadVertically {
    public String readVertically(String[] arr) {
        int maxLength=0;
        String result = "";

        for(String o : arr){
            maxLength = Math.max(maxLength,o.length());
        }
        //System.out.println(maxLength);

        for(int i=0; i<maxLength; i++){
            for(String o : arr){
                if(o.length()>i){
                    result += o.charAt(i);
                }
            }
        }
        return result;
    }
}
