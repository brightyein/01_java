package main.java.com.ohgiraffers.section01.literal;

public class Application01 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        /*
        * 주석입니다
        * */

        /* 목차 1. 숫자 형태의 값 */
        System.out.println(123); // 정수형 리터럴
        System.out.println(1.23); // 실수형 리터럴

        /* 목차 2. 문자 형태의 값 */
        System.out.println('a'); // 문자형 리터럴
        // System.out.println('ab'); // '' 는 둘 이상은 문자로 취급하지 않기에 에러 발생
        System.out.println('1');

        /* 목차 3. 문자열 형태의 값 */
        System.out.println("안녕하세요"); // 문자열(문자 배열)형 리터럴

        /* 목차 4. 논리형 형태의 값 */
        System.out.println(true);
        System.out.println(false);
    }
}
