package main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /*
    * final
    * final 은 종단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며, 의미가 약간 다르지만 결국 변경 불가의 의미
    *
    * 1. 지역 변수 : 초기화 이후 값 변경 불가
    * 2. 매개 변수 : 호출 시 전달한 인자 변경 불가
    * 3. 전역 변수 : 인스턴스 생서 후 초기화 이후에 값 변경 불가
    * 4. static 변수 : 프로그램 start 이후 값 변경 불가 (final 이 붙은 변수)
    * 5. non-static 메소드 : 메소드 재작성 불가
    * 6. static 메서드 : 메서드 재작성 불가
    *
    * final 은 변경 불가의 의미를 가진다.
    * 따라서 초기 인스턴스(생성된 객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화해 주어야 한다.
    * 그렇지 않으면 컴파일 에러가 발생한다.
    * */

//    private final int nonStaticNum; : 아무값도 넣어주지 않아 에러

    // 선언과 동시에 초기화 한다.
    private final int NON_STATIC_NUM = 1;

    // 생성자를 이용해 초기화 한다.
    private final String NON_STATIC_NAME;
    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    // static field 에 final 사용

    /*
    * static 에도 자바에서 지정한 기본값이 초기에 대입되기 때문에
    * final 키워드 사용 시 초기화 하지 않으면 에러가 발생한다.
    *
    * 생성자를 이용한 초기화는 불가능.
    * 생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그 전에 초기화가 일어나지 못함.
    * 하지만 static 은 프로그램이 start 될 때, 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일해
    * 기본값으로 초기화된 후 값을 변경하지 못하기 때문에 에러가 발생함.
    * */

    // 값을 미리 지정해서 초기화
    private static final int STATIC_NUM = 20;

    // 초기화 블럭으로 초기화 가능
    private static final double STATIC_DOUBLE;
    static {
        STATIC_DOUBLE = 10;
    }
}
