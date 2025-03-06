package oop;

// private : 외부 클래스에서 접근 불가능

public class Tv2 {
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    public Tv2() {

    }

    // 초기화 - 생성자
    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void changeChannel(int channel) {
        this.channel = channel;
    }

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
