package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car(); // 생성한 이 Car 는 카레이서만 접근 가능하도록

    /**
     * this.car 의 시동을 거는 메서드
     * */
    public void startUp() {
        car.startUp();
    }

    /**
     * this.car 를 앞으로 가게하는 메서드
     * */
    public void stepAccelator() {
        car.go();
    }

    /**
     * this.car 를 멈추는 메서드
     * */
    public void stepBreak() {
        car.stop();
    }

    /**
     * this.car 의 시동을 끄는 메서드
     * */
    public void turnOff() {
        car.turnOff();
    }
}
