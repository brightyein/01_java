package main.java.com.ohgiraffers.section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
        * 김경리가 사원 10명의 월급을 입금해줘야 하는 날이다.
        * 사원의 직책은 대리/과장/차장/부장 이 있으며
        * 대리는 100만원 과장은 120, 차장은 130, 부장은 150만원의 월급을 받는다.
        * 보너스는 각 월급 *0.5 만큼을 더해서 주어야 한다.
        * */
        // 화면에 출력되는 형태는 다음과 같아야 한다.
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입급되었습니다.

        int darry = 100;
        int kwajang = 120;
        int chajang = 130;
        int bujang = 150;

        System.out.println("김대리의 월급은 " + darry + "만원 + " + "보너스 "
                + (int)(darry*0.5) + "만원으로 총 " + (int)(darry+darry*0.5) + "만원 입금되었습니다." );
    }
}
