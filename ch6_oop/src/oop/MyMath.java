package oop;

// 오버 로딩
// 매서드 오버로딩 : 한 클래스 내에 같은 이름의 매서드를 여러개 정의하는 것 
// 생성자 오버로딩 : 한 클래스 내에 같은 이름의 생성자를 여러개 정의하는 것 

// 오버로딩 조건
// 1. 매서드명이 같아야한다.
// 2. 매개변수의 개수 또는 타입이 달라야한다.
public class MyMath {
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    int add(int a[]) {
        System.out.println("int add[]");
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
