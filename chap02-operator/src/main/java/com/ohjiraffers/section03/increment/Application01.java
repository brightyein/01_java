package main.java.com.ohjiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 증감 연산자
        * ++a, a++ : 앞 또는 뒤에 있는 피 연산자의 값을 1만큼 증가
        * --a, a-- : 앞 또는 뒤에 있는 피 연산자의 값을 1만큼 감소
        * */

        int num = 10;
        int num2 = 20;
        int result = 0;

        result = result * ++num; // 증감 연산자가 먼저 실행된 후 * 실행
        System.out.println(result);
        System.out.println(num); // 11 그래서 1 증가된 num 출력

        result = 1;
        result = result * num++; // 1 * 11 곱셈 후 num++ 실행
        System.out.println(result);
        System.out.println(num); // 12
    }
}
