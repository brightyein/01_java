package main.java.com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args) {

        /* 정수 리터럴 연산 형식의 값을 직접 연산한다. */

        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);

        System.out.println("-------------------------------------");

        /* 정수와 실수 연산 시 실수로 형변환된다. */

        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        System.out.println("-------------------------------------");

        /* 문자와 문자의 연산 */
        /* 문자 끼리의 연산도 사칙 연산 가능하다. */
        /* 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산 사용이 가능하단 것에 집중 */

        System.out.println('a' + 'b'); // 195 (아스키코드)
        System.out.println('ㄱ' + 'ㄴ'); // 25189 (유니코드)
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("-------------------------------------");

        /* 문자열은 + 연산만 가능하다. */
        /* 어떤 자료형과 만나도 문자열로 형변환된 결과값이 나온다. */

        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        System.out.println("-------------------------------------");

        /* 논리값 연산 */

        // System.out.println(true + false); // 불가능
        System.out.println(true + "false");
        // System.out.println(true + 1); // 불가능




    }
}
