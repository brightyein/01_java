package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product{

    public SmartPhone() {}

    // 추상 메서드는 구현이 강제적
    @Override
    public void abstractMethod() {
        System.out.println("product 클래스의 추상 메서드를 호출함");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 의 print 메서드를 호출함");
    }
}
