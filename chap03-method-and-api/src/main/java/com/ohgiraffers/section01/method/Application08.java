package main.java.com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /* static 메서드 호출 */

        System.out.println(Application08.sumTwoNumbers(10,20)); // static 메서드는 생성자없이 사용 가능

        System.out.println(sumTwoNumbers(10, 20)); // 같은 클래스 내에 있다면 '클래스명' 생략 가능

    }

    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
