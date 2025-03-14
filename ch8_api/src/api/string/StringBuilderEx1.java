package api.string;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        str1 += " 반갑습니다.";
        str1 += " 저는 홍길동입니다.";
        // String은 원본 문자열 변경 불가능 하기 때문에 매번 기존의 메모리를 해제하고 재생성

        // StringBuffer sb = "안녕하세요"; 불가능
        StringBuffer sb = new StringBuffer("안녕하세요");
        // sb.append(" 반갑습니다.");
        // sb.append(" 저는 홍길동입니다.");
        sb.append(" 반갑습니다.").append(" 저는 홍길동입니다.");

        // String equals 확인
        String str2 = new String("Hello");
        String str3 = new String("Hello");

        System.out.println(str2.equals(str3) ? "문자열 같음" : "문자열 다름");

        // StringBuffer equals 확인 - 부모가 상속해준 그래도 사용중 (오버라이딩안함)
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.equals(sb2) ? "문자열 같음" : "문자열 다름");

        // Stirng equals 사용하기 위해 변환
        // String obj1 = sb1.toString();
        // String obj2 = sb2.toString();

        String obj1 = new String(sb1);
        String obj2 = new String(sb2);
        System.out.println(obj1.equals(obj2) ? "문자열 같음" : "문자열 다름");

        // str1 거꾸러 출력 : charAt(30)
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        // str1.StringBuffer 로 변경

        System.out.println("StringBuffer reverse()" + sb.reverse());

        StringBuffer sb3 = new StringBuffer(str1);
        System.out.println("StringBuffer reverse()" + sb3.reverse());

        // delete(), insert()
        System.out.println("sb1.delete(0,2) " + sb1.delete(0, 2));
        // end는 포함 x
        System.out.println("sb1.deleteCharAt(0) " + sb1.deleteCharAt(0));
        // 원본 변경 후 또 변경

        // 0번 자리에 H 삽입
        System.out.println("sb1.insert(0, \"H\")" + sb1.insert(0, "H"));

        // replace()
        System.out.println("sb1.replace(0, 2, \"java\")" + sb1.replace(0, 2, "java"));
        System.out.println("원본 sb1 : " + sb1);
    }
}
