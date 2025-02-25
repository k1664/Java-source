package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float, double
        // 소수점 형태의 숫자를 사용하면 double로 인식함
        
        // float(4byte) = double(8byte) ==> 불가능
        // float 타입은 f, F 를 붙인다.
        float score1 = 90.14f;

        // double 타입도 d, D 를 붙인다. (안 붙여도 되긴한다.)
        double score2 = 98.5d;

        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        // 소수점 2째자리까지 표현
        System.out.printf("score2 = %.2f\n",score2);


    }
    
}
