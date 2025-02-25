package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한 개 => 'a' , '가' , ' '
        // 문자열 : 글자 한 개 ~ 여러개 "미" , "a" , "abc" , "대한민국" , " "
        
        // '기'라는 문자를 ch1에 대입
        char ch1 = '기';

        // ch1의 값을 unicode 변수에 대입
        // int = char (char로 선언된 변수를 int에 대입하면 유니코드로 바뀐다.)
        int unicode = ch1;
        
        System.out.println("ch1 = " + ch1);
        System.out.println("unicode = " + unicode); // '기' 문자의 unicode 값인 44592 출력
        
        char ch2 = 'a'; // 97
        unicode = ch2;
        
        System.out.println("ch2 = " + ch2);
        System.out.println("unicode = " + unicode);

        char ch3 = 'A'; // 65
        unicode = ch3;
        
        System.out.println("ch3 = " + ch3);
        System.out.printf("ch3 = %c\n",ch3);
        System.out.println("unicode = " + unicode);
    }
}
