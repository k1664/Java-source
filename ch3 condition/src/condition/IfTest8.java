package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        
        // 임금 구하기

        // 시간당 임금
        int rate = 9800;
        int pay, hours;
        
        // 사용자로 부터 근무 시간을 입력 받아 hours에 담고
        Scanner scanner = new Scanner(System.in);
        System.out.println("근무시간을 적어주세요: ");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);


        // 근무시간이 8시간 까지는 시간당 임금 지불
        // 8시간 초과 근무시에는 시간당 임금의 1.5배 지불
        // 임금 계산 후 pay 변수에 담기
        if( hours > 8 ){
            pay = (rate * hours + ( (rate * (hours - 8) ) / 2 ) );
            // pay = rate * 8 (int)(rate * (hours - 8 ) * 1.5 );
        } else {
            pay = hours * rate;
        }
        

        // 최종출력 (받는 임금은 얼마입니다.)
        System.out.printf("받는 임금은 %d입니다.\n", pay );
    }
    
}
