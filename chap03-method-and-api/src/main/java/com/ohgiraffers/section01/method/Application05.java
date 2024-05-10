package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /*
        * return ?
        *
        * - 모든 메서드 내부에는 return; 존재
        * - void 메서드의 경우 return 을 안써도 마지막 줄에 컴파일러가 자동으로 추가해줌
        * - return 은 현재 메서드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어.
        *
        * */

        System.out.println("main() 메서드를 시작함...");
        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main() 메서드를 종료함...");
    }

    public void testMethod() {

        System.out.println("testMethod() 동작 확인");

        return; // 생략 가능

        /* 메서드는 리턴을 만나면 종료되기에 리턴 이후 코드 작성 불가 */
        // System.out.println();
    }
}
