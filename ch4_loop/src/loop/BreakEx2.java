package loop;

// break는 if 형태를 주로 사용한다.

public class BreakEx2 {
    public static void main(String[] args) {
        // 주사위 눈이 6이 나올 때 까지 주사위 돌리기

        while (true) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위 : %d\n", dice);

            if (dice == 6)
                break;
        }
    }
}
