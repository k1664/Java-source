package condition;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후 계산해서 결과 출력
        // +, -, *, /, %

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 정수 하나를 입력하세요.");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두번째 정수 하나를 입력하세요.");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.println("연산자를 입력해주세요");
        input = scanner.nextLine();
        String operator = input;

        switch (operator) {
            case "+":
                System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
                break;
            case "%":
                System.out.printf("%d % %d = %d", num1, num2, num1 % num2);
                break;
            default:
                System.out.println("입력값을 확인해 주세요");
                System.exit(0); // 프로그램 강제 종료
        }
        // int result = case로 num1과 num2의 연산을 넣고 마무리로
        // System.out.printf("%d %s %d = %d", num1, operator, num2 , result);

    }

}
