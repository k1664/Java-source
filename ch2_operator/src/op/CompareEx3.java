package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, > <=, >=
// 등가비교 : ==(equal), !=(not equal)

// 문자열 : "a", "abc"

public class CompareEx3 {
    public static void main(String[] args) {
        // 변수선언 : 기본타입(ch1 - VarByteEx1 참조)
        // 문자열은 기본타입으로 선언하지 않는다. 객체타입으로 선언
        String str1 = "abc";    
        String str2 = "abc";
        String str3 = new String("abc");

        // str1을 저장하는 공간과 str3 을 저장하는 공간이 다름
        // 같은 공간에서 저장된 문자열 비교시 == 을 사용하면(값 비교) true 가 뜬다.
        // 다른 공간에서 저장된 문자열 비교시 == 을 사용하면(주소 비교) false 가 뜬다.
        

        System.out.printf("str1 == str2 = %b\n", str1 == str2); // true
        System.out.printf("str1 == str3 = %b\n", str1 == str3); // false

        // 문자열 비교는 == 대신에, equals(), equalsIgnoreCase() 사용
        // abc != ABC  자바는 대소문자를 구분하기 때문에
        System.out.printf("str1.equals(str3) = %b\n", str1.equals(str3)); // true
        System.out.printf("str1.equals(\"ABC\") = %b\n", str1.equals("ABC")); // false
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n", str1.equalsIgnoreCase(str3)); // true
        System.out.printf("str1.equalsIgnoreCase(\"ABC\") = %b\n", str1.equalsIgnoreCase("ABC")); // true
        

        
    }
    
}
