package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator; // import문

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application02 {
    public static void main(String[] args) {

        /*
        * import 임포트
        *
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우,
        * 패키지명을 포함한 풀 클래스 명을 사용해야 한다.
        *
        * 하지만! 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        * */

        int first = 10;
        int second = 20;

        int max = maxNumberOf(first, second);
        System.out.println(max);

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println(min);

        /* static method 는 import 하여 클래스명 생략 가능 */
        int max2 = maxNumberOf(100, 200);
        System.out.println(max2);
    }
}
