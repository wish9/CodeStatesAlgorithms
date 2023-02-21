package CodeStatesAlgorithms;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) { // sort 사용 안하고 오름차순으로 정렬하는 메서드
        int[] result = arr.clone();
        for(int j=0; j<arr.length; j++) {
            boolean stillNotSort = false;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (result[i] > result[i + 1]) { //앞요소가 뒷요소보다 크면 // 부등호만 바꾸면 내림차순 됨
                    int small = result[i + 1];
                    result[i + 1] = result[i]; // 두 위치 바뀌기
                    result[i] = small;
                    stillNotSort =true;
                }
            }
            if(!stillNotSort) break;
        }
        return result;
    }
}
