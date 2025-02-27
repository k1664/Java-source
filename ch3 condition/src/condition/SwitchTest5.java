package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 점수입력( 0 ~ 100 ) 받은 후 점수에 따라 등급 출력
        // 90점 이상 A, 80이상 B, 70이상 C, F

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수(0~100)를 입력해주세요: ");
        String input = scanner.nextLine();
        int grade = Integer.parseInt(input);

        // grade / 10 의 몫만 가져온다.
        switch (grade / 10) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

    }
}
