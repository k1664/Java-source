package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5명 학생의 수학점수를 입력받아서 평균, 총합 구하기
        System.out.println("");

        int[] arr = new int[5];

        // System.out.println("첫번째 학생 점수 입력 >> ");
        // arr[0] = sc.nextInt();

        // System.out.println("두번째 학생 점수 입력 >> ");
        // arr[1] = sc.nextInt();

        // System.out.println("세번째 학생 점수 입력 >> ");
        // arr[2] = sc.nextInt();

        // System.out.println("네번째 학생 점수 입력 >> ");
        // arr[3] = sc.nextInt();

        // System.out.println("다섯번째 학생 점수 입력 >> ");
        // arr[4] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d 번째 학생 점수 입력 >> ", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // 평균, 총합
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("총합 : %d, 평균 : %d", sum, sum / arr.length);
        System.out.printf("총합 : %d, 평균 : %.2f", sum, (double) sum / arr.length);
    }
}
