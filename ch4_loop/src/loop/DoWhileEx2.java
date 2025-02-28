package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한번 실행(조건검사를 나중)
public class DoWhileEx2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("메세지를 입력하세요.");
        String input;
        // 문자 입력 받은 후 출력
        // q 입력 받으면 종료
        do {
            System.out.print("종료 하려면 q를 입력하세요: ");
            System.out.print(">> ");
            input = Scanner.nextLine();
        } while (!input.equals("q")); // ==,!= => equals,
        System.out.println("프로그램 종료합니다.");
    }
}
