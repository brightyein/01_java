package main.java.com.ohgiraffers.section03.math;

public class Application02 {
    public static void main(String[] args) {

        /* 사용자 지정 범위의 난수를 발생시킬 수 있다. */

        // 0~9 까지의 난수 발생
        int random1 = (int)(Math.random()*10);
        System.out.println(random1);

        // 1~10 까지의 난수 발생
        int random2 = (int)(Math.random()*10)+1;
        System.out.println(random2);

        // 10~15 까지의 난수 발생
        int random3 = (int)(Math.random()*6)+10;
        System.out.println(random3);

        // -200 ~ 200
        int random4 = (int)(Math.random()*401)-200; // 곱해줄 값은 전체 범위의 크기인 401
        System.out.println(random4);

    }
}
