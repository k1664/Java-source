package oop;

// main이 없는 class

// Tv 클래스를 이용해서 Tv(인스턴스) 생성
// 객체 구성요소
// 1. 속성(특성) => 맴버변수
// 2. 기능(동작) => 멤버메소드

public class Tv { // class를 열고 만드는 변수를 맴버 변수라고 한다.
    // 크기(int), 색상(String), 채널(int), 볼륨(int) <= 속성
    int size;
    String color;
    int channel;
    int volume;

    boolean power;

    // 채널 변경, 볼륨 변경, 전원 켜기
    void channelup() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    // 마우스 우클릭 - source action - generate tostring
    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }
}
