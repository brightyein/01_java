package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공
        *
        * sc.nextLine()
        * 한 줄 전체의 문자열을 입력받기 위해 사용되는 메소드
        * */

        Scanner sc = new Scanner(System.in);

        // sc.nextLine()
        System.out.println("이름을 입력해 주세요 : ");
        String name = sc.nextLine();

        System.out.println("안녕하세요 " + name + "님! ^_^");
        System.out.println("--------------------------------");

        // sc.nextInt()
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println(age + "세 이시군요!");
        System.out.println("--------------------------------");

        // sc.nextLong()
        System.out.println("원하는 금액을 입력해주세요 : ");
        long cost = sc.nextLong();
        System.out.println(cost + "원을 투입해주세요 :)");
        System.out.println("--------------------------------");

        // sc.nextDouble()
        System.out.println("몸무게를 입력하세요 : ");
        double weight = sc.nextDouble();
        System.out.println(weight + "kg 입니다!");
        System.out.println("--------------------------------");

        // sc.nextBoolean()
        System.out.println("당신은 자바를 공부하십니까? (true/false) : ");
        boolean isJava = sc.nextBoolean();
        System.out.println(((isJava)?"학습중":"비학습중") + "이시군요! 답변 감사합니다.");
        System.out.println("--------------------------------");

        sc.nextLine(); // boolean 값 입력 후 엔터를 누르며 입력된 개행문자(\n)를 얘가 먹어서 없애줘!

        System.out.println("아무 문자나 입력해 주세요 : ");
        char charValue = sc.nextLine().charAt(0);
        System.out.println(charValue);
    }
}
