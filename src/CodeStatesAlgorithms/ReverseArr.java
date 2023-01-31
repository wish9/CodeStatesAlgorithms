package CodeStatesAlgorithms;

import java.util.Arrays;

public class ReverseArr {
    // 0번 인덱스를 마지막으로 보내기
    // 보낸 요소 빼고 재귀
    // 맨 앞 인덱스 뒤에 붙이기 반복
    public int[] reverseArr(int[] arr){
        if(arr.length==0) return arr;

        int[] result1 = Arrays.copyOfRange(arr,0,1);
        int[] result2 = reverseArr(Arrays.copyOfRange(arr,1, arr.length));

        int[] result = new int[arr.length];
        System.arraycopy(result2, 0, result, 0, result2.length);
        System.arraycopy(result1, 0, result, result2.length, result1.length);

        return  result;

    }
}
