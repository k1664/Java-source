package oop;

// Static 메서드 : 클레스 매서드 

public class PrimitiveParamEx {
    public static void main(String[] args) {
        // main 메서드
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x = " + d.x);
        // change(d.x);
        change2(d);
        System.out.println("After Change()");
        System.out.println(d.x);

        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();

    }

    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x); // 값이 넘어가고 리턴되면 주소에 있는 값은 변함없음
    }

    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x); // 주소가 넘어가고 바뀜
    }
}
