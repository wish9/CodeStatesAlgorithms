package CodeStatesAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Tiling { // 타일링 알고리즘!! // 그냥 피보나치 비슷
    public int tiling(int num) { // 2xn 보드의 2x1 타일을 깔 수 있는 경우의 수를 구하시오
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        return tile(num, list);
    }

    public int tile(int num, List<Integer> list){
        if(list.size()<=num) {
            list.add(tile(num-1, list) + tile(num-2, list));
        }
        return list.get(num);
    }
}
