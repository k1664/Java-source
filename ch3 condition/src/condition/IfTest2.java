package condition;

public class IfTest2 {
    public static void main(String[] args) {
        int score = 93;

        // score가 90 보다 크면 점수가 90점 이상입니다. 등급은 A 입니다.
        // score가 90 보다 작으면 점수가 90점 미만입니다. 등급은 B 입니다.
        if (score > 90) {
            System.out.println("점수가 90점 이상입니다.\n등급은 A 입니다.");
        } else {
            System.err.println("점수가 90점 미만입니다.\n등급은 B 입니다.");
        }

        
    }    
}
