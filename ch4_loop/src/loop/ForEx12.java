package loop;

public class ForEx12 {
    public static void main(String[] args) {
        // 4x + 5y = 60이 만족하는 해
        // 단, x, y는 10 이하의 자연수
        // 출력문 예시 (5,3)

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.printf("(%d,%d)\n", i, j);
                }

            }
        }

    }
}
