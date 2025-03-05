package oop;

public class Calc {
    // 사칙연산
    long add(long num1, long num2) {
        return num1 + num2;
    }

    long subtract(long num1, long num2) {
        return num1 - num2;
    }

    long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    // long 타입의 입력 값 2개 5, 3
    // 출력 : 큰 숫자 => 5
    long max(long a, long b) {
        // 조건 ? 참 : 거짓;
        return a > b ? a : b;
        // if (a > b) {
        // return a;
        // } else {
        // return b;
        // }
    }

    long min(long a, long b) {
        // if (a < b) {
        // return a;
        // } else {
        // return b;
        // }
        return a < b ? a : b;
    }
}
