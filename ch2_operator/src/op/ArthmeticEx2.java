package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        // 변수 선언
        byte a = 10, b = 4;
        // byte, short 연산 수행 시 연산의 결과가 int형으로 변경 됨
        // a + b를 담을 때 int형으로 바뀌기 때문에 byte로 못바꾼다.
        // byte c = a + b; <- 불가능

        // 해결책 1
        // int c = a + b;

        // 해결책 2 결과값이 -128 ~127 사이라면
        byte c = (byte)(a + b);



    }
    
}
