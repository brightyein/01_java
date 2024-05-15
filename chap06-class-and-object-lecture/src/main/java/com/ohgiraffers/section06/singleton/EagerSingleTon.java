package main.java.com.ohgiraffers.section06.singleton;

public class EagerSingleTon {

    private static EagerSingleTon eager = new EagerSingleTon(); // 기본생성자를 private 으로 접근제한

    private EagerSingleTon(){}

    public static EagerSingleTon getInstance() {
        return eager;
    }
}
