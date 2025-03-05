package oop;

public class MiniCalEx {
    public static void main(String[] args) {
        // print() 메소드 호출
        // 클래스메서드(or 변수)이기 때문에 객체 생성없이 클래스이름으로 호출가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // exeucte() 호출하고 싶음
        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 7;

    }
}
