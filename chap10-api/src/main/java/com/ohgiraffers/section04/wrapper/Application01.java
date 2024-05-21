package main.java.com.ohgiraffers.section04.wrapper;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다. : 메서드가 매개변수로 인스턴스만 받는 경우
        * 이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데,
        * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있다고 하는 클래스를
        * 래퍼클래스 (Wrapper class) 라고 한다
        * */

        /*
        * 기본타입          래퍼클래스
        * byte             Byte
        * short            Short
        * int              Integer
        * long             Long
        * float            Float
        * double           Double
        * char             Character
        * boolean          Boolean
        *
        * */

        /*
        * 박싱 (Boxing) / 언박싱 (UnBoxing)
        * 박싱 (Boxing) : 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는것
        * 언박싱 (UnBoxing) : 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것
        * */

        int intValue = 20;
        Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber2 = Integer.valueOf(intValue);

        int unBoxingNumber = boxingNumber1.intValue();

        /*
        * 오토 박싱, 오토 언박싱
        * JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
        * 이런 자동화된 박싱과 언박싱을 오토박싱, 오토 언박싱이라 부른다.
        * */

        Integer boxingNumber3 = intValue; // 오토박싱
        int unBoxingNumber2 = boxingNumber3; // 오토언박싱

        // Wrapper 클래스 값 비교
        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        // 기본 타입과 래퍼클래스 타입 == 연산 : 값 비교
        System.out.println("int 와 integer 비교 : " + (inum == integerNum1)); // true
        System.out.println("int 와 integer 비교 : " + (inum == integerNum3)); // true

        // 생성자를 이용한 인스턴스 == 비교 : 주소값 비교
        System.out.println("integer 와 integer 비교 : " + (integerNum1 == integerNum2)); // false
        System.out.println("integer 와 integer 비교 : " + (integerNum1 == integerNum3)); // false

        // 오토박싱 한 것끼리는 == 비교 가능
        System.out.println("integer 와 integer 비교 : " + (integerNum3 == integerNum4)); // true

        // equals() 가 오버라이드 되어 있어서 값 비교가 정확함
        System.out.println("equals() : " + (integerNum1.equals(integerNum2))); // true
        System.out.println("equals() : " + (integerNum1.equals(integerNum3))); // true

        // 결론 : == 사용하지말고 equals 로 비교하는것이 정확하다

        /*
        * Integer.valueOf() 를 이용해 인스턴스를 생성하는 것을 더 권장
        * valueOf() 는 동일한 값이 동일한 인스턴스임을 보장한다.
        * */

        System.out.println("valueOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));

    }
}
