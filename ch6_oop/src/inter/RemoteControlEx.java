package inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(8);
        rc.SetMute(true);
        rc.turnOff();

        RemoteControl.changBattery();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // 익명 구현 클래스
        rc = new RemoteControl() {

            private int volume;

            @Override
            public void turnOn() {
                System.out.println("라디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("라디오를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 TV 볼륨 : " + this.volume);
            }
        };
        rc.turnOn();
        rc.turnOff();
    }
}
