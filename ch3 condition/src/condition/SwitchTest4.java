package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {
        // 가위(1),바위(2),보(3)

        // 컴퓨터가 내는 가위,바위,보 결정
        int computer = ((int)Math.random() * 3) + 1;
        

        // 사용자가 내는 가위,바위,보 결정
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1),바위(2),보(3) 중에서 하나 입력 : ");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);


        // com 2(바위) - user 1(가위) = 1 (바위가 이김)
        System.out.println(computer);
        switch (computer - user) {
            case 0:
                System.out.println("draw");
                break;
            case -1:
            case 2:
                System.out.println("user win");
                break;
            case 1:
            case -2:
                System.out.println("computer win");
                break;
        }

    }
    
}
