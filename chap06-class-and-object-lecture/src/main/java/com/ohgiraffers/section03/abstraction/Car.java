package main.java.com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn; // 초기값 = false

    private int speed;

    public void startUp() {
        if (isOn) {
            System.out.println("이미 차의 시동이 걸려있어요.");
        } else {
            this.isOn = true;
            System.out.println("차의 시동이 걸렸어요.");
        }
    }

    public void go() {
        if (isOn) {
            if (speed==0) {
                System.out.println("자동차가 출발을 시작합니다.");
            }
            this.speed+=10;
            System.out.println("자동차는 시속 " + speed + "km/h 입니다.");
        } else System.out.println("자동차는 시동이 걸려야 출발이 가능합니다.");
    }

    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                while (this.speed > 0) {
                    this.speed--;
                    System.out.println("현재 속도 " + this.speed + "km/h");
                }
            } else System.out.println("이미 멈춰있는 상태입니다.");
        } else System.out.println("시동을 걸지 않은 경우 유압으로 인해 브레이크가 점점 무거워집니다.");
    }

    public void turnOff() {
        if (isOn) {
            if (this.speed > 0) {
                System.out.println("달리는 상태에서 시동을 끄는것은 위험합니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다. 고생하셨습니다.");
            }
        } else System.out.println("이미 시동이 꺼져있습니다.");
    }
}
