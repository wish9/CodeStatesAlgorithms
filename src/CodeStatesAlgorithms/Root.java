package CodeStatesAlgorithms;

public class Root {  // Math.sqrt 안쓰고 제곱근 구하기
    public String computeSquareRoot(int num) { // 귀납법 이용

        double num2 = 1.00;
        double beforeNum2 = 0.00;
        boolean bo = true;

        while(bo){
            num2 = (num2+num/num2)/2;
            if(num2==beforeNum2) bo=false;
            beforeNum2 = num2;
        }

        String result2 = String.format("%.2f", num2);
        return result2;
    }

    public String computeSquareRoot2(int num) { // 하나씩 더해가면서 비교한 방식
        double[] diffs = new double[]{1, 0.1, 0.01, 0.001}; //소수점 3자리부터 반올림하기 때문에, 배열에 소수점 자리만큼 double값을 선언, 할당
        double base = 1;

        for(int i = 0; i < diffs.length; i++) {
            while (base * base < num) {
                base = base + diffs[i];
            }
            if(base * base == num) {
                return String.format("%.2f", base);
            }else {
                base = base - diffs[i]; //while문에서 오버된 값 한번 빼줘야 함
            }
        }
        return String.format("%.2f", base);
    }
}
