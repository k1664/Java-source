package ch1;

// byte : 8비트
// 숫자 표현 : 2의 8제곱 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능


public class VarLongEx1 {
    public static void main(String[] args) {
        // 변수
        // 기본타입 : 정수형, 문자형, 실수형, 불린형
        // 정수형 : byte(1), short(2), int(4), long(8)
        // 문자형 : char(2)
        // 실수형 : float(4), double(8)
        // 불린형 : boolean(1)

        // 변수선언 : 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다.
        // max-speed : 데이터베이스 필드명으로 많이 쓴다. 
        long age = 15, maxSpeed = 100;
        long max = 256L;

        // long : 숫자 뒤에 L, l 대소문자 둘 다 가능한데 대문자를 선호한다.

        long money = 1000000000000L;

        // 변수값을 수정 할 때는 타입을 다시 쓰지 않고 변수명만 불러온다.
        age = 30;

        // + : 산술연산
        // + : 연결(문자)

        System.out.println("나이 : "+age + ", 최고속도 : " + maxSpeed + ", max : " + max);
        System.out.println(age + maxSpeed + max);
    }
    
}
