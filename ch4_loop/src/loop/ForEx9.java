package loop;
/*

 * 
 ** 
 *** 
 ****
 *****  <- 원하는 결과물

 */

import java.util.Scanner;

public class ForEx9 {
    public static void main(String[] args) {

        // * 을 출력할 라인의 수 입력 받기

        Scanner scanner = new Scanner(System.in);
        System.out.print("* 을 출력할 라인의 수 입력 받기 : ");
        int input = scanner.nextInt();

        for (int i = 1; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
