package CodeStatesAlgorithms;

import java.util.*;

public class LargestMultiplication {
    public int largestProductOfThree(int[] arr) { // 배열 요소 중 3개를 뽑아 곱했을 때 나올 수 있는 최대값을 구하라
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        int result = -1;
        for(int j=0; j<arr3.length; j++) {     // 절대값 큰 순서대로 정렬
            int max = 0;
            int index = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (Math.abs(arr2[i]) > max) {
                    index = i;
                    max = Math.abs(arr2[i]);
                }
            }
            arr3[j] = arr2[index];
            arr2[index]=0;
        }
        boolean containPositive = false;
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i]>0) {
                containPositive = true;
                break;
            }
        }


        if(!containPositive) { //arr3가 전부 음수면
                result = arr3[arr3.length-1]*arr3[arr3.length-2]*arr3[arr3.length-3];
                return result;
        }

        for(int j=0; j<=arr3.length-3; j++){
            result = arr3[0]*arr3[1]*arr3[2+j];
            if(result>0) break;
        }

        if(result<0){
            for(int k=2; k<=arr3.length-2; k++){
                result = arr3[0]*arr3[1+k]*arr3[2];
                if(result>0) break;
            }
        }

        if(result<0){
            for(int i=3; i<=arr3.length-2; i++){
                result = arr3[0+i]*arr3[1]*arr3[2];
                if(result>0) break;
            }
        }

        return result;
    }


    public int largestProductOfThree2(int[] arr) { // 간단하게 압축 가능
        //배열을 오름차순으로 정리합니다.
        Arrays.sort(arr);
        int arrLength = arr.length;
        //가장 큰 양수 3가지를 곱한 값
        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
        //가장 작은 음수 2가지와, 가장 큰 양수를 곱한 값
        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
        return Math.max(candidate1, candidate2);
    }
}
