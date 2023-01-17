public class MakeMathlog {
    public boolean mathlog(long num) { // 2의 거듭제곱인지 판별
        boolean result = true;
        double num2 = num*1.0;
        while (num2>1){
            result = false;
            if(num2%2==0) result = true;
            num2 = num2/2;
        }
        return result;
    }
}
