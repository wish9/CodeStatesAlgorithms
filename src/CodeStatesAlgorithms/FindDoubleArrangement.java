package CodeStatesAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDoubleArrangement { // 규칙이 있는 이중배열에서 k의 인덱스 찾기
    public int orderOfPresentation(int N, int[] K) {
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=0; i<K.length; i++){
            int num = K[i];
            for(Integer o : arrayList){
                if(o<K[i]) num--;
            }
            result = result + numberOfCase(num,N-i);
            arrayList.add(K[i]);
        }

        return result;
    }

    public int numberOfCase(int num, int N){
        int result = 0;
        result = result + (num-1)*factorial(N-1);
        return result;
    }

    public int factorial(int num){
        if(num<=0) return 0;
        if(num==1) return 1;

        return num*factorial(num-1);
    }

    public int orderOfPresentation2(int N, int[] K) {
        // 조의 개수 N, 발표 순서 K
        // 발표 순서를 만드는 것은 순열(permutation)이므로, 발표 순서의 모든 경우의 수는 !(팩토리얼)이다.

        int order = 0;

        boolean[] isUsed = new boolean[N + 1];

        for (int i = 0; i < K.length; i++) {
            int num = K[i];
            isUsed[num] = true;
            boolean[] candidates = Arrays.copyOfRange(isUsed, 1, num); // // num보다 앞에 올 수 있는 수들의 배열을 복제
            int validCnt = 0;
            for (boolean candidate : candidates) if (!candidate) validCnt++; // 아직 사용되지 않은 수의 개수 카운팅
            int formerCnt = validCnt * factorial(N - i - 1);
            order = order + formerCnt;
        }
        return order;
    }
}
