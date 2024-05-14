package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

import static java.lang.Math.min;

public class Application01 {
    public static void main(String[] args) {

        /*
        * api
        *
        * Application Programming interface 는 응용 프로그램에서 사용할 수 있도록,
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해 우리가 구현할 수 없거나, 구현하기 번거로운 기능들을 jdk 를 설치하면 자동으로 사용할 수 있도록
        * 제공해 놓은 소스코드들을 의미한다.
        * 더 쉽게 말해 누가 작성해 놓은 소스 코드들을 가져다 쓰는 방법을 본다는 말이다.
        * 모든 코드를 개발자들이 다 외울 수 없기 때문에 api 문서를 별도로 제공해주고 있다.
        *
        * */

        /*
        * java.lang.Math
        * Math 클래스는 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해 놓은 클래스이다.
        * 모든 메서드는 static 메서드로 정의되어있다.
        *
        * */

        // abs() : 절댓값
        System.out.println(java.lang.Math.abs(-7)); // 7

        // import 해서 사용하기
        System.out.println(Math.abs(-7)); // 7

        // min() : 최솟값
        System.out.println(min(10, 20)); // 10

        // max() : 최댓값
        System.out.println(Math.max(10, 20)); // 20

        // PI : 원주율
        System.out.println(Math.PI);

        // random() : 난수 발생
        System.out.println((int)(Math.random()*100));

        // 난수 발생
        Random random = new Random(); // 생성자로 메모리에 미리 적재한 다음 메서드 사용
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        // -128 ~ 127 사이의 난수 발생
        int randomNumber1 = new Random().nextInt(256)-128; // 바로 메서드 꺼내서 사용

    }
}
