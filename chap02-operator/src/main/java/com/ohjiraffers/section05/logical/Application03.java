package main.java.com.ohjiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 논리식 && : 앞의 결과가 false 이면 뒤 연산은 실행하지 않음.
        * 논리식 || : 앞의 결과가 true 이면 뒤 연산은 실행하지 않음.
        * */

        int num1 = 10;
        int result = (false && ++num1 > 0)? num1 : 20; // 삼항연산자 false
        System.out.println(result); // 20
        System.out.println(num1); // 10, 앞이 false 였기 떄문에 뒤 ++num1 연산은 실행하지 않았음

        int num2 = 20;
        int result2 = (true || ++num2 > 0)? num2 : 30;
        System.out.println(result); // 20
        System.out.println(num2); // 20

    }
}
