package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str = "Hello";
        // 문자열 연결 : +
        str += " World";

        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다.
        String str2 = "안녕하세요";
        str2 = str2.concat(" 반갑습니다.");

        System.out.println(str2);

        // endsWith(), startsWith
        System.out.println("지정된 문자열로 종료 여부 : " + str2.endsWith("요"));
        System.out.println("지정된 문자열로 시작 여부 : " + str2.startsWith("안"));

        String file = "text.txt";
        // 이미지 : png or gif or jpg
        if (file.endsWith("png") || file.endsWith("gif") || file.endsWith("jpg")) {
            System.out.println("이미지 파일입니다.");
        } else {
            System.out.println("이미지 파일이 아닙니다.");
        }

        // replace() 결과는 새로운 문자열로 반환 : 원본 변경 x
        System.out.println("replace(old,new) " + str.replace("Hello", "안녕하세요"));
        System.out.println(str); // Hello World

        // 원본 변경
        str = str.replace("Hello", "안녕하세요");
        System.out.println(str);

        // replaceAll() - 정규식 사용가능
        System.out.println(str.replaceAll("[a-z]", "1")); // 안녕하세요 W1111

        str2 = "Hellolo";
        System.out.println(str2.replaceFirst("ll", "LL"));

        // subString()
        str2 = "java.lang.Object";
        System.out.println("특정 위치의 문자열 얻기 " + str2.substring(10)); // Object
        System.out.println("특정 위치의 문자열 얻기 " + str2.substring(5, 9)); // lang, 끝나는 위치 포함 x

        // split()
        str2 = "dog,cat,bear";
        System.out.println("지정한 분리자로 나누어 배열로 반환 " + Arrays.toString(str2.split(",")));
        String[] arr = str2.split(",", 2); // 지정된 숫자만큼 분리
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자 / 소문자 변경
        str2 = "HEllo";
        System.out.println("소문자 변경" + str2.toLowerCase());
        System.out.println("대문자 변경" + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        String str3 = "    Hello World     ";
        System.out.println(str3);
        System.out.println(str3.trim());

        int i = 5;
        String str4 = String.valueOf(i); // "5"
        str4 = i + ""; // "5"
    }
}
