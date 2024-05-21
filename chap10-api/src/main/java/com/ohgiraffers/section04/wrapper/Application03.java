package main.java.com.ohgiraffers.section04.wrapper;

public class Application03 {
    public static void main(String[] args) {

        // parsing 과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요하다.

        /*
        * valueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환시키는 메서드
        * toString() : 필드값을 문자열로 반환하는 메서드
        * */

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        // String 클래스의 valueOf 를 사용할 수도 있다.
        String str = String.valueOf(10);
        String str2 = String.valueOf(8L);
        String str3 = String.valueOf(4.0f);

        String str4 = 123 + ""; // 123 도 문자열로 업캐스팅 변환됨
    }
}
