package main.java.com.ohgiraffers.section01.method;

public class Application03 {

    int test = 10; // 전역변수

    public static void main(String[] args) {

        /*
        * 변수의 종류
        *
        * 1. 지역변수 : 하나의 메서드 내의 변수 (다른 메서드에서 사용 불가)
        * 2. 매개변수(parameter) : 메서드에 전달하는 변수 (전달받은 메서드에서만 사용 가능)
        * 3. 전역변수(필드) : 클래스 안에 존재하는 메서드 전체에서 사용할 수 있는 변수
        * 4. 클래스(static)변수
        *
        * */

        /* 전달인자와 매개변수는 개수와 타입이 일치해야함. */
        Application03 app3 = new Application03();
        app3.testMethod(28); // 전달인자(Argument)


        /* 변수에 값을 저장하여 인자로 전달 가능 */
        int age = 20;
        app3.testMethod(age);

        /* 자동 형 변환을 이용한 값 전달 */
        byte byteAge = 20;
        app3.testMethod(byteAge);

        /* 강제 형 변환을 이용한 값 전달 */
        long longAge = 30;
        app3.testMethod((int)longAge);

        /* 연산 결과를 이용한 값 전달 */
        app3.testMethod(byteAge*2);

    }

    public void testMethod(int age) { // 매개변수(Parameter)
        System.out.println("당신의 나이는 " + age + "세 입니다.");

        int localVariable = 7; // 지역변수
    }
}
