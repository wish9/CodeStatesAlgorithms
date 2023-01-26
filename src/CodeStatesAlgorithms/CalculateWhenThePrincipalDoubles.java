package CodeStatesAlgorithms;

public class CalculateWhenThePrincipalDoubles{

        public int computeWhenDouble(double interestRate) { // 연이율을 입력받아 원금이 2배 이상이 되는 시간(년)을 리턴
            double principal = 100;
            int result = 0;
            for(int i=1; i<100; i++){
                principal = principal*(100+interestRate)/100;
                if(principal>=200) {
                    result=i;
                    break;
                }
            }
            return result;
        }
}
