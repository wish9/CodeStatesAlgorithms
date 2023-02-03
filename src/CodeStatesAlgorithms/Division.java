package CodeStatesAlgorithms;

public class Division {
    public Integer modulo(int num1, int num2) { // 연산자 /, %를 사용하지 않고 num1을 num2로 나눈 나머지 구하기
        if(num2 == 0) return null;
        int result = num1;

        while(result>=num2){
            result -= num2;
        }

        return result;
    }
}
