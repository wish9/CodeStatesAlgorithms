package CodeStatesAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsSubsetOf { // 부분집합인지 여부를 판단
    public boolean isSubsetOf(int[] base, int[] sample) {
        boolean result = true;
        List<Integer> baseList = Arrays.stream(base) // Array를 stream으로 변환
                .boxed() // primitive(기본형) 타입을 wrapper 타입으로 박싱하여 반환
                .collect(Collectors.toList()); // stream을 List로 변환

        for(int o : sample){
            if(!baseList.contains(o)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
