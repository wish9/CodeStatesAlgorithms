package CodeStatesAlgorithms;

import java.util.HashMap;

public class TransformFirstAndLast {



    //String[] arr = new String[]{'Queen', 'Elizabeth', 'Of Hearts', 'Beyonce'}; // input예시
    public HashMap<String, String> transformFirstAndLast(String[] arr) {

        if(arr.length==0){
            return null;
        }else{
            HashMap<String,String> result = new HashMap<>();
            result.put(arr[0],arr[arr.length-1]);

            return result;
        }
    }
}
