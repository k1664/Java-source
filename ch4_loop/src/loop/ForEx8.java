package loop;
/*

 * 
 ** 
 *** 
 ****
 *****  <- 원하는 결과물

 */

public class ForEx8 {
    public static void main(String[] args) {
        /*
         * for (int i = 1; i <= 1; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 1; i <= 2; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 1; i <= 3; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 1; i <= 4; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * for (int i = 1; i <= 5; i++) {
         * System.out.print("*");
         * }
         * System.out.println();
         */
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
