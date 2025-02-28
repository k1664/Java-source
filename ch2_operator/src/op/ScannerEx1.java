package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in : 키보드, System.out : 화면

        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nextLine() : 문자열로 받아옴 , 그래서 String으로 선언함
        String input = scanner.nextLine();

        // 문자열 말고 정수(int형)로 바꾸고 싶다.
        int num = Integer.parseInt(input);
        System.out.println("입력값 : " + num);

        scanner.close();

    }

}
