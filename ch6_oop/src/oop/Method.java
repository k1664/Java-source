package oop;

// 메소드 : 리턴타입 메소드명(){}
// 리턴(반환) 타입 : 기본타입(int, String, boolean, float 등등), 객체(대문자로 시작), 배열, void(리턴타입 없음)

public class Method {

    int method1() {
        int sum = 15;

        // return 0;
        return sum;
    }

    String method2() {

        String str = "Hello";
        // return null;
        return str;
    }

    double method3() {
        return 35;
    }

    char method4() {
        return ' ';
    }

    void method5() {
        // return; (넣을 수도 있고 안 넣기도 함)
    }

    // 매개변수가 있는 메서드
    // 리턴(반환) 타입 : 기본타입(int, String, boolean, float 등등), 객체(대문자로 시작), 배열
    // 갯수 상관없음 1 ~
    int add(int x, int y) {
        return x + y;
    }

    float add2(int x, float y) {
        // float + int : float
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + ": " + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }

}
