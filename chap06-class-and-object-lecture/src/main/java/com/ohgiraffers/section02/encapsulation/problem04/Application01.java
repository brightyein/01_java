package main.java.com.ohgiraffers.section02.encapsulation.problem04;

public class Application01 {
    public static void main(String[] args) {

        Monster monster1 = new Monster();

        /* private 필드라서 직접 접근 불가 */
        // monster1.kinds = "두치";
        // monster1.hp = 200;

        /*
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        * public 으로 접근을 허용한 메서드만 이용할 수 있도록 해논것이다.
        * 이것을 캡슐화 (encapsulation) 라고 부른다.
        * */
        monster1.setKinds("늑대인간");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());
    }
}
