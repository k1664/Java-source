package condition;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        //score를 입력 받아
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수 입력 : ");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        // score >= 90   등급은 A 입니다.   : if()
        // score >= 80   등급은 B 입니다.   : elseif()
        // score >= 70   등급은 C 입니다.   : elseif()
        // score >= 60   등급은 D 입니다.   : elseif()
        // score < 60    등급은 F 입니다.   : else

        

        if (score >= 90) {
            System.out.println("등급은 A 입니다.");
        } else if(score >= 80){
            System.err.println("등급은 B 입니다.");
        } else if(score >= 70){
            System.err.println("등급은 C 입니다.");
        } else if(score >= 60){
            System.err.println("등급은 D 입니다.");
        } else{
            System.out.println("등급은 F 입니다.");
        }

        scanner.close();
    }    
}
