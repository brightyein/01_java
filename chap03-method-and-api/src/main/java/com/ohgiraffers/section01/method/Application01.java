package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 메소드란?
        *
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합
        * 클래스의 스코프를 벗어나면 생성할 수 없음
        * 메서드를 사용하기 위해서는 생성자를 만들어줘야 한다
        * */

        System.out.println("main() 메소드 시작됨...");

        Application01 app = new Application01(); // 클래스도 하나의 자료형 > 사용하려면 변수처럼 초기화해야 사용가능
        app.methodA(); // 메서드 호출 가능해짐

        System.out.println("main() 메소드 종료됨...");
    }

    public void methodA() {

        System.out.println("methodA() 호출");

        methodB(); // static 이 없는 곳에서는 생성자없이 호출 가능

        System.out.println("methodA() 종료");
    }

    public void methodB() {

        System.out.println("methodB() 호출");
        System.out.println("methodB() 종료");
    }

}
