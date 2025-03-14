package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세요";

        // 문자열 길이
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("지정된 위치에 있는 문자 반환 : " + str.charAt(0));
        System.out.println("지정된 위치에 있는 문자 반환 : " + str.charAt(4));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        // char 배열로 변환
        char[] charr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charr[i] = str.charAt(i);
        }
        System.out.println("charr : " + Arrays.toString(charr));

        char[] result = str.toCharArray();

        // String => char 배열
        System.out.println(Arrays.toString(result));

        System.out.println("주어진 문자가 문자열에 존재 여부 확인 : " + str.indexOf("안"));
        System.out.println("주어진 문자가 문자열에 존재 여부 확인 : " + str.indexOf("반"));

        System.out.println(str.contains("안"));

        String subject = "자바의정석";
        System.out.println(subject.indexOf("자바"));
        // 자바 문자가 있으면 자바와 관련 있는 책입니다. / 자바와 관련 없는 책입니다.
        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련 있는 책입니다.");
        } else {
            System.out.println("자바와 연관 없는 책입니다.");
        }

        if (subject.contains("자바")) {
            System.out.println("자바와 관련 있는 책입니다.");
        } else {
            System.out.println("자바와 연관 없는 책입니다.");
        }

        // 찾기 시작하는 위치 지정 기능
        System.out.println("찾는 시작 위치 지정 " + str.indexOf("하", 4));
        System.out.println("문자열의 오른쪽 끝부터 찾기 " + str.lastIndexOf("하"));
        String str2 = "java.lang.String";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".", 5));
        System.out.println(str2.lastIndexOf("."));
    }
}
