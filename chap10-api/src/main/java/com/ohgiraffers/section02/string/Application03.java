package main.java.com.ohgiraffers.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 문자열을 특정 구분자 기준으로 분리한 문자열을 반환하는 기능
        *
        * 1. split() : 정규표현식을 이용해 문자열을 분리
        *              비정형화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
        *              정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
        *
        * 2. StringTokenizer : 문자열의 모든 문자열을 구분자로 하여 문자열을 분리
        *                      정형화된 문자열 패턴을 분리할 때 사용하기 좋다 (공백 문자열 무시)
        *                      split() 보다 속도면에서 더 빠르다
        *                      구분자를 생략하는 경우 공백이 기본 구분자다.
        * */

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";
        String emp4 = "400/김예인/서울///";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));

        // 음수를 넣으면 빈 문자열도 출력해줌
        String[] empArr4 = emp4.split("/", -4);
        System.out.println(Arrays.toString(empArr4));

        String[] empArr5 = emp3.split("/", -1);
        System.out.println(Arrays.toString(empArr5));

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");
        StringTokenizer st4 = new StringTokenizer(emp4, "/");

        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }

        String colorStr = "red*orange#blue/yellow green";

        /* split() 사용 */
        // String color = colorStr.split("*#/");
        // [] 으로 묶으면 정규표현식 관계없이 사용 가능
        String[] colors = colorStr.split("[*#/ ]");
        System.out.println(Arrays.toString(colors));

        /* StringTokenizer 사용 */
        StringTokenizer colorStrTokenizer = new StringTokenizer(colorStr, "*#/ ");

        while (colorStrTokenizer.hasMoreTokens()) {
            System.out.println(colorStrTokenizer.nextToken());
        }
    }
}
