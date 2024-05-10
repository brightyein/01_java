package main.java.com.ohgiraffers.section04.question;

import main.java.com.ohgiraffers.section04.scanner.Test;

import java.util.Random;

public class Question {
    public static void main(String[] args) {

        /*
        * -100 에서 100 사이의 난수를 발생시켜서 매개변수로 전달하면 (0은 고려하지 않음)
        * 매개변수가 양수면서 짝수면 x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
        *          음수면서 짝수면 x는 음수면서 짝수입니다. 음수면서 홀수면 음수면서 홀수입니다.
        * 를 반환하는 메서드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력해보자
        * */

        // -100 에서 100 사이의 난수 발생
        Random random = new Random();
        // int randomNumber = (random.nextInt(200))-100; // java.util.Random 클래스
        int randomNumber = (int)(Math.random()*401)-200; // java.lang.Math 클래스의 random() 사용

        System.out.println("생성된 난수는 " + randomNumber + "이며, ");

        // 생성된 난수를 test.testRandomNum()에 전달
        Test test = new Test();
        System.out.println(test.testRandomNum(randomNumber));

    }
}
