package op;

    // true && true => true(둘다 true 여야 true)
    // true || true => true(둘 중 하나만 true 라면 true)
    // !true => false   ! = (not연산자)
import java.util.Scanner;

public class LogicalEx2 {
    public static void main(String[] args) {
        // 사용자로부터 문자를 입력 받은 후 그 문자가
        // 숫자인지 영문자인지 판별하는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요");

        String input = scanner.nextLine();

        // "abc" => "abc".charAt(0) : a, "abc".charAt(1) : b
        // charAt(index) : 문자열을 문자로 분해해서 돌려 받을 수 있다.
        // index는 0번부터 시작한다.
        char ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        }

        if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z') {
            System.out.println("입력하신 문자는 영문자입니다.");
        }
        
        scanner.close();
    }
    
}
