package main.java.com.ohgiraffers.section02.encapsulation.problem01;

public class Monster {

    String name; // 클래스 안 전역변수

    int hp;

    // 올바른 hp 값인지 검증
    public void setHp(int hp) {
        if (hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 설정합니다.");
            this.hp = hp; // this : 자기 자신을 의미
        } else {
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;
        }
    }
}
