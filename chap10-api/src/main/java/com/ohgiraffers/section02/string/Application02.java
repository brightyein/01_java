package main.java.com.ohgiraffers.section02.string;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리 (singleton)
        * new String("문자열") : 매번 새로운 인스턴스를 생성
        * */

        // 직접 대입 : 힙영역의 스트링풀에서 같은 공간(주소값)으로 관리된다
        String str1 = "java";
        String str2 = "java";

        // 같은 내용의 다른 객체 생성 : 새로운 힙 영역을 만들어 다른 주소값을 가진다
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 == str2); // 주소비교 : true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false

        // 자바에서 문자열의 hashCode 는 재정의되어 있음 (주소값이 달라도 내용이 같으면 hashCode 도 같도록 반환)
        System.out.println(str1.hashCode()); // 3254818
        System.out.println(str2.hashCode()); // 3254818
        System.out.println(str3.hashCode()); // 3254818
        System.out.println(str4.hashCode()); // 3254818

        str2 += "oracle"; // 주소값이 달라짐
        System.out.println(str1 == str2); // false

        /*
        * equals() : String 클래스의 equals 메소드는 인스턴스 비교가 아닌 문자열값을 비교해
        * 동일한 값을 가지면 true 다른값이면 false 반환
        * Object 의 equals() 메서드를 재정의해 두었다.
        * 따라서 문자열 인스턴스 생성 방식은 상관없이 동일한 문자열인지 비교하기 위해 == 대신
        * equals() 메서드를 사용해야 한다.
        * */
        System.out.println(str1.equals(str3)); // true
    }
}
