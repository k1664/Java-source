package condition;

public class IfTest5 {
    public static void main(String[] args) {
        // 주사위 1~^
        
        // 0.0 <= Math.random() <= 1.0
        System.out.println(Math.random());
        
        // (Math.random() * 6) 0 ~ 5 ) + 1
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println(dice);
    
        // num 이 1이면 주사위 1번이 나왔습니다.
        if(dice == 1){
            System.out.println("주사위 1번이 나왔습니다.");
        } else if(dice == 2){
            System.out.println("주사위 2번이 나왔습니다.");
        } else if(dice == 3){
            System.out.println("주사위 3번이 나왔습니다.");
        } else if(dice == 4){
            System.out.println("주사위 4번이 나왔습니다.");
        } else if(dice == 5){
            System.out.println("주사위 5번이 나왔습니다.");
        } else if(dice == 6){
            System.out.println("주사위 6번이 나왔습니다.");
        }
    }
}
