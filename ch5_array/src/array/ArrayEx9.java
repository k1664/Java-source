package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        // numArr 0 ~ 9 초기화하기
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));
        /*
         * 변수 값 교환
         * int a = 10, b = 15;
         * int tmp;
         * 
         * tmp = a;
         * a = b;
         * b = tmp;
         */

        for (int i = 0; i < 100; i++) {
            // 교환 위치 임의 생성 : 0 ~ 9
            int pos = (int) (Math.random() * 10);

            int tmp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = tmp;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
