package array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" }
        };

        Scanner sc = new Scanner(System.in);

        // Q1. chair(words[0][0])의 뜻은?
        // 정답입니다. (words[0][1].equals(사용자 입력값))
        // Q2. computer(words[1][0]) 의 뜻은? 의자
        // 틀렸습니다. 정답은 컴퓨터입니다.

        int ran = (int) (Math.random() * 3);
        System.out.println(ran + "\tran check");
        System.out.printf("Q1 %s의 뜻은?", words[ran][0]);
        String input = sc.nextLine();

        if (words[ran][1].equals(input)) {
            System.out.println("정답입니다.");
        } else {
            System.out.printf("오답입니다. 정답은 %s입니다.", words[ran][1]);
        }
    }
}
