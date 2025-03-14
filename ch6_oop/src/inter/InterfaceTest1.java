package inter;

class A {
    public void methodA(B b) { // 관계는 없지만 매개변수로 받아서 b.methodB를 쓸 수 있다.
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.methodA(new B());
    }
}
