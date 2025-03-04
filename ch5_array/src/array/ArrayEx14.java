package array;

public class ArrayEx14 {
    public static void main(String[] args) {
        // 2차원 배열
        // 타입[][] 배열명 = new 타입[3][3];

        // 값을 알고 있는 경우
        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };
        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("======================================");

        // 합계

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d", i + 1);
            int sum = 0; // 총점
            float avg = 0; // 평균
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
                avg = sum / (float) score[i].length;
            }
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
        System.out.println("======================================");
        System.out.printf("총점 : %3d %3d %3d\n", korTotal, engTotal, mathTotal);
    }
}
