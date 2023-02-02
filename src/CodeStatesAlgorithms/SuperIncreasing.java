package CodeStatesAlgorithms;

public class SuperIncreasing {
    public boolean superIncreasing(int[] arr) { // 오름차순으로 정렬 되어 있는지 확인
        int sum =arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<=sum) return false;
            sum += arr[i];
        }
        return true;
    }
}
