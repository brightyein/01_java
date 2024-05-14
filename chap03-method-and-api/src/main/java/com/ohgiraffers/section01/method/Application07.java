package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {

        /*
        * 실습
        *
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 메서드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메서드
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 메서드
        *
        * 반환받아서 메인 메서드에 System.out.println 을 이용해 출력할 것.
        * */

        Application07 app7 = new Application07();

        System.out.println("3과 2를 입력받아 더한 값 : " + app7.add(3, 2));
        System.out.println("5과 3를 입력받아 뺀 값 : " + app7.minus(5,3));
        System.out.println("7과 3를 입력받아 곱한 값 : " + app7.multiply(7,3));
        System.out.println("8과 2를 입력받아 나눈 값 : " + app7.divide(8,2));

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
