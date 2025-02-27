package loop;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {
        // 팩토리얼 구하기
        // 입력받은 숫자의 팩토리얼 구하기 
        // 4 : 4 * 3 * 2 * 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("팩토리얼을 구할 숫자를 입력하시오.");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        System.out.printf("%d의 팩토리얼 값은 : %d 입니다." , num1 , fact);
    }
    
}
