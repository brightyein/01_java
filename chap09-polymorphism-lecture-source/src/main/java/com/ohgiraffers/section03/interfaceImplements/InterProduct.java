package main.java.com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct {

    public static final int MAX_NUM = 100; // 인터페이스는 상수만 가질 수 있음

    int MIN_NUM = 10; // 자동으로 final 키워드 붙는다

    void abstractMethod();
    // 반드시 구현해야하기 때문에 자동으로 public 이 붙는다
    // (public abstract) 가 앞에 생략되어 있음

    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 static method 호출");
    }

    default void defaultMethod() {
        System.out.println("InterProduct 클래스의 default 메서드 호출");
    }

}
