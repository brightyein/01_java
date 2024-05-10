package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 패키지란?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성하는 것
        *
        * - 같은 패키지 내 동일한 클래스명 불가, 패키지가 다르면 가능
        * - 클래스명은 원래 패키지명을 포함하고 있기 때문.
        * - 지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유 : 동일 패키지 내에서 사용했기 때문
        * - 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 클래스명 앞에 패키지명을 명시하여 풀 클래스 명으로 사용해야 함
        * */

        // Calculator 호출
        main.java.com.ohgiraffers.section01.method.Calculator calc = new main.java.com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30, 20);
        System.out.println(min);

        // static 메서드 호출
        int max = main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf(30, 20);
        System.out.println(max);

    }
}
