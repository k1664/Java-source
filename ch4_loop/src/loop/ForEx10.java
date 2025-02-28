package loop;
/*

     * 
    ** 
   *** 
  ****
 *****  <- 원하는 결과물

 */

import java.util.Scanner;

public class ForEx10 {
    public static void main(String[] args) {

        // * 을 출력할 라인의 수 입력 받기

        Scanner scanner = new Scanner(System.in);
        System.out.print("* 을 출력할 라인의 수 입력 받기 : ");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j < 0; j++) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                System.out.println(j > i ? " " : "*");
            }
        }
        scanner.close();
    }
}
