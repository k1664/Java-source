package array;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };

        int max = score[0], min = score[0];
        // 배열에 저장된 값 중에서 최대값과 최소값 구하기
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println("최대값 : " + max + "\n최솟값 : " + min);

    }
}
