package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString(); // 1. 부모인스턴스 먼저 생성 2. 후 자식인스턴스 생성

        // 본인 맴버 변수가 우선됨
        System.out.println("이름 : " + obj.name);
        obj.list(); // 성춘향 하위 클래스 이름 <= 출력을 원한다면
    }
}
