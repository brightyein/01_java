package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {

        /*
        * java.util.Random 클래스
        *
        * Random 클래스의 nextInt() 메서드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시키는 메서드
        * */

        /*
        * <원하는 방식의 난수를 구하는 공식>
        * random.nextInt(구하려는 난수의 범위) + 구하려는 난수의 최솟값
        * */

        Random random = new Random();

        // 0~9 난수 발생
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);

        // 1~10 난수 발생
        int randomNumber2 = random.nextInt(10)+1;
        System.out.println(randomNumber2);

        // 20~45 난수 발생
        int randomNumber3 = random.nextInt(26)+20;
        System.out.println(randomNumber3);

    }
}
