package main.java.com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    // 전체 필드 초기화 생성자
    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    // 최고 시속 출력 메서드
    public void driveMaxSpeed() {
        System.out.println(modelName + "가 최고 시속 " + maxSpeed + "km/h 로 달립니다.");
    }
}
