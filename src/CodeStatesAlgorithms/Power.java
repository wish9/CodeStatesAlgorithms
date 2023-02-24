package CodeStatesAlgorithms;

public class Power { // Math.pow를 사용하지 않고 거듭제곱 구하기 (시간복잡도 O(logN)으로 제한)
    public long power(int base, int exponent) { // 시간복잡도 bad
        if(exponent==0) return 1;
        --exponent;
        return base*power(base,exponent)%94906249;
    }

    public long power2(int base, int exponent) { // 시간복잡도 good
        long base2 = base;
        int exponent2 = exponent;
        long result = 1;

        while (exponent2>1){
            if(exponent2%2==0){
                base2= base2*base2%94906249;
                exponent2 = exponent2/2;
            }else{
                result = result*base2%94906249;
                --exponent2;
            }
        }

        return result*base2%94906249;
    }

    public long power3(int base, int exponent) { //시간복잡도 good

        if(exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1) return (base * result) % 94906249;
        else return result;
    }
}
