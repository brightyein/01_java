package main.java.com.ohgiraffers.section01.init;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /*
        * 객체 배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러개의 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
        *
        * 배열에 객체를 담으면 객체의 주소값을 저장한다.
        * */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 120);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        // Car[] cars = {car1, car2, car3, car4, car5};
        Car[] cars = new Car[5];
        cars[0] = new Car("페라리", 300);
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        System.out.println("-------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }

        System.out.println("-------------------------------------------");

        // 인스턴스 초기화 블럭으로 직접 값 넣어주기
        Car[] cars2 = {
                new Car("페라리", 300),
                new Car("티코", 120),
                new Car("포터", 100)
        };

        for (Car car : cars2) {
            car.driveMaxSpeed();
        }

        System.out.println(Arrays.toString(cars2));
    }
}
