package api.opbject;

public class objectEx {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        // 주소가 값이 같으냐? (같은 인스턴스를 가리키고 있으냐) : 다르다
        System.out.println(object1.equals(object2) ? "같음" : "다름");
        System.out.println(object1 == object2 ? "같음" : "다름");

        // java.lang.Object@5ca881b5
        // 패키지명.클래스명@5ca881b5
        System.out.println("object1 toString() " + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);

        // 부모에게 상속 시 참조변수의 주소값 비교
        // 멤버 변수의 값 비교 equals 재정의 : 멤버변수 value의 값이 같은 값인지 비교
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");

        System.out.println("value toString() " + value1.toString());

        Person p1 = new Person("hong123", "홍길동");
        Person p2 = new Person("hong123", "박길동");

        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");
        System.out.println("Person toString() " + p1.toString());
    }
}
