package main.java.com.ohgiraffers.section02;

public abstract class Product {

    private int nonStaticField;

    private static int staticField;

    public Product() {}

    public void nonStaticMethod() {
        System.out.println("product 클래스의 nonstaticmethod를 호출");
    }

    public static void staticMethod() {
        System.out.println("product 클래스의 staticmethod 호출");
    }

    public abstract void abstractMethod(); // 무조건 정의해줘야 함 단, 구체적 구현 불가
}
