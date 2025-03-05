package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Method method = new Method();

        // 메서드 호출
        int result = method.add(15, 25);
        System.out.println(result);

        float result2 = method.add2(35, 45.2f);
        System.out.println(result2);

        System.out.println(method.add(45, 55));

        method.print("홍길동", "s123"); // void의 경우 호출만하고 끝(넘어오는게 없음)

        int[] array = { 11, 22 };
        int[] array2 = method.arr(array);
        System.out.println(Arrays.toString(array2));

    }
}
