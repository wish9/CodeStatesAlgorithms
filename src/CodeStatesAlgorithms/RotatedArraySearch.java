package CodeStatesAlgorithms;

public class RotatedArraySearch { // 시간복잡도 O(logN)으로 구해보자.
    public int rotatedArraySearch(int[] rotated, int target) { // 부분적으로 오름차순 정렬 된 배열에서 target을 요소로 갖는 인덱스 위치를 찾기
        for(int i=0; i<rotated.length; i++){
            if(rotated[i]>target&&(rotated[i]-target)>rotated.length/2) break;
            if(rotated[i]==target) return i;
        }

        for(int i=rotated.length-1; i>=0; i--){
            if(rotated[i]==target) return i;
        }

        return -1;
    }// 이것도 결국엔 O(N)이다..

    public int rotatedArraySearch2(int[] rotated, int target) {
        int left = 0;
        int right = rotated.length - 1;

        while(left <= right) {
            int middle = (right + left) / 2;

            if(rotated[middle] == target) {
                return middle;
            }

            if (rotated[left] < rotated[middle]) {
                if (target < rotated[middle] && rotated[left] <= target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target <= rotated[right] && rotated[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return -1;
    }
}
