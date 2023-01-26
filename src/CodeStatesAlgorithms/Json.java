package CodeStatesAlgorithms;

import java.util.*;

public class Json {
    public String stringify(Object data) {

        //입력된 값이 문자열일 경우
        if(data instanceof String){
            String text = "\"";
            return text+data+text;
        }

        //입력된 값이 Integer일 경우
        else if(data instanceof Integer){
            String changed =  Integer.toString((Integer) data);
            return changed;
        }

        //입력된 값이 Boolean일 경우
        else if(data instanceof Boolean){
            String changed =  String.valueOf(data);
            return changed;
        }

        //입력된 값이 Object[]일 경우

        else if(data instanceof Object[]){
            if(((Object[]) data).length == 0) return  "[]";
            String str = "[";

            Iterator<?> it = Arrays.asList((Object[])data).iterator();
            while (it.hasNext()) {
                str += stringify(it.next()) + ",";
            }
            str = str.substring(0,str.length()-1);
            str += "]";   // Iterator 2차 실패... 무한루프..
            return str;
        }

        //입력된 값이 HashMap일 경우
        else if(data instanceof HashMap){

            if(((HashMap) data).isEmpty()){
                return "{}";
            }
            String res = "{";
            for (Map.Entry<?, ?> o : ((HashMap<?, ?>) data).entrySet()) {
                res += stringify(o.getKey())+ ":" + stringify(o.getValue())+",";
            }
            res = res.substring(0,res.length()-1);
            res += "}";

            return res;
        }

        //지정되지 않은 타입의 경우에는 "null"을 리턴합니다.
        return "null";
    }
}
