package main.java.com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*
        * 매개변수(parameter)로 사용 가능한 자료형
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변 인자 ( 예) String... )
        * */

        ParameterTest pt = new ParameterTest();

        // 기본자료형을 매개변수로 전달 받는 메서드 호출 확인
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        // 기본 자료형 배열을 매개변수로 전달 받는 메서드 호출 확인
        int[] iarr = new int[]{1,2,3,4,5,6,7};
        System.out.println("인자로 전달하는 주소값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("변경 후 원본 배열의 값 출력 : " + Arrays.toString(iarr));
        System.out.println("---------------------------------------------------");

        // 3. 클래스 자료형을 매개변수로 전달받는 메서드 호출 확인
        Rectangle r1 = new Rectangle(12.5, 22.5);
        System.out.println("인자로 전달하는 r1의 값 : " + r1);

        // 직접 ractangle 접근
        r1.calcArea();
        r1.calcRound();

        // 매개변수 전달 (가지고 있는 객체를 얕은 복사하는 느낌)
        pt.testClassTypeParameter(r1);
        System.out.println("변경 후 사각형의 넓이와 둘레 : ");
        r1.calcArea();
        r1.calcRound();

        // 가변인자를 매개변수로 전달 받는 메서드 호출 확인

        // pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순", "볼링", "축구", "탁구");
        pt.testVariableLengthArrayParameter("이순신", "볼링");
        pt.testVariableLengthArrayParameter("신사임당", new String[]{"테니스", "서예","농구"});

    }
}
