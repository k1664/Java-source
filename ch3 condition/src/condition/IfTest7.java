package condition;

import java.util.Scanner;

public class IfTest7 { 
    public static void main(String[] args) {
        // 사용자로 부터 num1 이라는 변수를 받고
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        
        //num1 이 짝수, 홀수인지 출력하기

        if (num1 % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
   
    }
}
