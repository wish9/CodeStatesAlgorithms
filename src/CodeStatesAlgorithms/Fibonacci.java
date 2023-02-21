package CodeStatesAlgorithms;

import java.util.ArrayList;

public class Fibonacci { // 시간복잡도 최소로 줄인 피보나치 수열 num번째 값 구하기
    public int fibonacci(int num) {
        if(num==0) return 0;
        else if(num>0) {
            int[] result = new int[num + 1];
            result[0] = 0;
            result[1] = 1;

            return fibo(num, result);
        }

        return 0;
    }

    public int fibo(int num, int[] arr){
        if(arr[num]==0) {
            if (num == 1) return 1;
            if (num == 0) return 0;
            arr[num] = fibo(num - 2, arr) + fibo(num - 1, arr);
        }
        return  arr[num];
    }

    public int fibonacci2(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        return fibo2(list, num);
    }

    public int fibo2(ArrayList<Integer> list, int num) {
        if (list.size() <= num) {
            list.add(fibo2(list, num - 1) + fibo2(list, num - 2));
        }
        return list.get(num);
    }

}
