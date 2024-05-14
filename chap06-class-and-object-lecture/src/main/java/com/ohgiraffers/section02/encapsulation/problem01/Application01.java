package main.java.com.ohgiraffers.section02.encapsulation.problem01;

public class Application01 {
    public static void main(String[] args) {

        /* 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다. */
        /* 클래스 안 전역변수(필드)에 직접 접근하는 경우 발생하는 문제점1 - 올바르지 않은 값 입력시에도 막지 못함 */
        /* 검증을 매번 할수도 있지만 캡슐화하면 그 메서드만 갖다 쓸 수 있다. */

        /* 캡슐화 목적 1.
        *  필드에 값을 넣을 때 유효하지 않은 값을 넣지 못하도록 막는 유효성 검증 메서드를 클래스 내에 포함하는 것 */

        // 1번 몬스터 생성
        Monster monster1 = new Monster();

        // 이름과 체력 변경
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);
        System.out.println("------------------------------------");

        // 2번 몬스터 생성
        Monster monster2 = new Monster();

        // 이름과 체력 변경
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);
        System.out.println("------------------------------------");

        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);

        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);
        System.out.println("------------------------------------");

        // 4번 몬스터 생성
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);

        System.out.println("monster4 name : " + monster4.name);
        System.out.println("monster4 hp : " + monster4.hp);
    }
}
