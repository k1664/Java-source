package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력 받아 입력 받은 수 중 가장 큰 수와 가장 작은 수 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수 입력:");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        
        System.out.println("두번째 수 입력:");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        
        System.out.println("세번째 수 입력:");
        input = scanner.nextLine();
        int num3 = Integer.parseInt(input);

        int max, min;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if(num2 > num1 && num2 > num3){
            max = num2;
        } else {
            max = num3;
        }

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if(num2 < num1 && num2 < num3){
            min = num2;
        } else {
            min = num3;
        }

        System.out.printf("가장 큰 수 : %d 가장 작은 수 : %d", max , min);

        

    }
    
}
