package main.java.com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {

        /* 다른 클래스에 작성한 메서드 호출 */

        //최솟값, 최댓값을 비교할 두 정수 선언
        int first = 100;
        int second = 50;

        // non-method 최솟값 출력
        Calculator calc = new Calculator(); // minNumberOf 는 일반 메서드라 생성자 필요
        int min = calc.minNumberOf(first, second);
        System.out.println(min);

        // static-method 최댓값 출력
        int max = Calculator.maxNumberOf(first, second); // maxNumberOf 는 static 메서드라 바로 호출
        System.out.println(max);

        /* static 메서드는 원래의 클래스명으로 호출하는 것이 좋다 */
        // (램에 통으로 올라가기 때문에 메모리 효율이 좋지 않기 때문)
        calc.maxNumberOf(first, second); // 램에 전체가 올라가게 되어 권장 X
        Calculator.maxNumberOf(first, second); // 바로 코드를 끌어올 수 있어서 효율적 권장 O

    }
}
