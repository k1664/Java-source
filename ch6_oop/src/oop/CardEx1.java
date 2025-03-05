package oop;

public class CardEx1 {
    public static void main(String[] args) {

        // static으로 선언된 변수와 메서드는 클래스이름. 접근

        System.out.println("카드 너비 " + Card.width);
        System.out.println("카드 높이 " + Card.height);

        // kind와 number를 불러오기 위해
        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 7;
    }
}
