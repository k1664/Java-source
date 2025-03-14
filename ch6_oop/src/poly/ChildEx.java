package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child(); // 오버라이딩이 불러와진다.

        // child1.method1();
        // child1.method2();
        // child1.method3();

        // parent 접근 범위가 좁아졌다.
        // parent.felid1;
        parent.method1();
        parent.method2();

        // The method method3() is undefined for the type Parent
        // parent.method3();

        // method3를 사용하고 싶다.
        // 부모 = 자식 (O)
        Child child2 = (Child) parent; // 강제 형변환(cast)
        child2.method3();

        // java.lang.ClassCastException: class poly.Parent
        // 자식 = 부모 (X)
        Parent parent2 = new Parent(); // new 대상이 child가 아님
        child2 = (Child) parent2;
        child2.method3();
    }
}
