package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한번 실행(조건검사를 나중)
public class DoWhileEx1 {
    public static void main(String[] args) {
        // 컴퓨터가 1~100사이의 임의의 수 생성 / 생성된 숫자 맞추기
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자 답변저장

        // 1~100사이의 정수를 입력받아서
        // 더 큰 수 입력 or 더 작은 수 입력 or 정답
        Scanner Scanner = new Scanner(System.in);

        int i = 0;
        do {
            System.out.print("1~100 사이의 정수를 입력하세요: ");
            input = Scanner.nextInt();
            if (answer < input) {
                System.out.println("입력한 값이 더 큽니다. 더 작은 수를 입력하세요");
            } else if (answer > input) {
                System.out.println("입력한 값이 더 작습니다. 더 큰 수를 입력하세요");
            }

        } while (answer != input);
        System.out.println("값이 일치합니다. 프로그램 종료합니다.");
    }
}
