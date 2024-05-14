package main.java.com.ohgiraffers.section01.method;

public class Application06 {
    public static void main(String[] args) {

        /*
        * 메서드 리턴값
        *
        * 메서드는 항상 마지막에 return; 명령어가 존재
        * return : 자신을 호출한 구문으로 복귀함을 의미
        * 이 때 가지고 가는 값을 리턴값이라 함.
        *
        * return 값을 가지려면 메서드 선언부에 리턴 타입 반드시 명시
        * void: 아무 반환값도 가지지 않겠다는 리턴값에 사용
        * 반환값이 없는 경우 : return 생략 가능 (컴프일러가 자동으로 추가)
        * 반환값이 있는 경우 : return 반드시 작성
        * 메서드 선언부에 선언한 리턴타입과 반환값의 자료형은 반드시 일치해야 함
        *
        * */

        System.out.println("main() 메서드 시작됨...");

        Application06 app6 = new Application06();
        System.out.println(app6.test());

        System.out.println("main() 메소드 종료됨...");
    }

    public String test() {
        return "Hello World";
    }
}
