package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;

        System.out.println("String 숫자 => int " + Integer.parseInt("10"));
        System.out.println("int => String 숫자" + i.toString());
        System.out.println("(5, 8) max " + Integer.max(5, 8));
        System.out.println("(5, 8) min " + Integer.min(5, 8));

        /*
         * 예전에는 int를 Integer로 바꾸는 작업 혹은 반대의 작업을 할 때
         * 객체 <=> 기본타입 변환이었기 때문에 많이 썻지만 지금은 거의 퇴색되었다.
         */
    }
}
