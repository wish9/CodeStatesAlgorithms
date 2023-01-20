import java.util.HashMap;

public class ArrayToHashmap {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String,String> result = new HashMap<String,String>();

        if(arr.length==0 || arr[0].length==0){
            return result;
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (!result.containsKey(arr[i][0]))
                    result.put(arr[i][0], arr[i][1]);
            }
            return result;
        }

    }
}
