package main.java.com.ohgiraffers.section02.encapsulation.problem02;

public class Application01 {
    public static void main(String[] args) {

        /* 필드에 직접 접근하는 경우 발생하는 문제점2 _ 필드명 변경 시 다 바꿔야함 (유지보수 어려움) */

        /* 캡슐화 목적 2.
         *  코드 수정이 필요할 경우 객체의 클래스 필드만 수정하면 되도록 캡슐화 _ 유지보수 용이*/

        // monster 3마리 추가
//        Monster monster1= new Monster();
//        monster1.name = "예인";
//        monster1.hp = 500;
//
//        Monster monster2 = new Monster();
//        monster2.name = "프랑켄슈타인";
//        monster2.hp = 300;
//
//        Monster monster3 = new Monster();
//        monster3.name = "미이라";
//        monster3.hp = 400;
//
//        System.out.println("monster1 = " + monster1.name);
//        System.out.println("monster1 = " + monster1.hp);
//        System.out.println("monster2 = " + monster2.name);
//        System.out.println("monster2 = " + monster2.hp);
//        System.out.println("monster3 = " + monster3.name);
//        System.out.println("monster3 = " + monster3.hp);
    }
}
