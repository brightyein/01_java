package main.java.com.ohgiraffers.section05.overloadingTest;

public class OverloadingTest {

    /*
    * 오버로딩의 사용 이유
    *
    * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
    * 이 떄, 동일한 기능의 메서드를 매개변수에 따라 이름을 다르게 정의하면 복잡하고 관라하기가 매우 어려울 것이다.
    * 규모가 작은 프로그램의 경우는 정도가 덜 하지만, 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
    * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메서드를
    * 관리하기 위해 사용하는 기술을 오버로딩 이라고 한다.
    *
    * ex) println(); // 자바에 정의된 코드를 보면 여러 자료형을 매개변수로 받는 println() 이 정의되어 있다.
    *
    * */

    /*
    * 오버로딩의 조건
    * 동일한 이름을 가진 메서드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
    * 한 클래스 내 동일한 이름의 메서드를 여러개 작성할 수 있다.
    * 메서드의 시그니처가 다르면 다른 메서드로 인식하기 때문이다.
    * 즉, 시그니쳐 중 메서드 이름을 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.
    *
    * 메서드 시그니처란?
    * public void method(int num){} 이라는 메서드에서 메소드명과 파라미터 선언부 부분을 시그니처라고 한다.
    * method(int num) 이 부분이 시그니처
    * 메서드의 시그니처가 달라야 하기 때문에 접근제어자나 반환명을 오버로딩 성립조건에 해당하지 않는다.
    * */

    public void test() {}

//    private void test() {} : 접근제어자가 달라도 메서드 시그니처가 같다면 에러
//    public int test() {} : 반환타입이 달라도 메서드 시그니처가 같다면 에러

    public void test(int num) {}
    public void test(int num, String name) {}
    public void test(String name, int num) {}
    //    public void test(String gender, int num) {}
    public void test(double num) {}

}
