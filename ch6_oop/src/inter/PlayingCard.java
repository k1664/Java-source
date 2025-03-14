package inter;

public interface PlayingCard {

    // 멤버변수 가질 수 없음
    // boolean pause;

    // 상수(주로 대문자로 선언)
    public static final int SAPDE = 4;
    // public static final 생략 가능 (무조건 상수이기 때문에)
    int CLOVER = 1;

    // 일반 메서드 가질 수 없음
    // void pause() {}

    // public abstract 생략 가능
    void pause();

    // static, default 가 붙는다면 일반메소드도 허용
    static void display() {
    }

    default void print() {
    }

}
