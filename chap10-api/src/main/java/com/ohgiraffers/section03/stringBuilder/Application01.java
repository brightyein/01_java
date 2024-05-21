package main.java.com.ohgiraffers.section03.stringBuilder;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
        *
        * StringBuilder : 스레드 동기화 기능 제공하지 않음
        *                 스레드 동기화 처리를 고려하지 않는 상황에서 StringBuffer 보다 성능이 좋음
        *
        * StringBuffer : 스레드 동기화 기능 제공
        *                성능면에서는 StringBuilder 보다 느림
        *
        * 두 개의 차이는 스레드 동기화 유무이고, 기능의 차이는 없음.
        *
        * 스레드 동기화 처리 : 하나의 스레드가 일을 다 처리한 후 다음 스레드가 실행되도록 하는 것
        * 스레드 동기화 X : 동시에 두 스레드가 실행되도록 하는 것
        * */

        /*
        * String 과 StringBuilder
        *
        * String = 불변이라는 특징을 갖는다.
        *          문자열에 + 연산으로 합치는 경우, 기존 인스턴스를 수정하는 것이 아닌 새로운 인스턴스 반환
        *          따라서 문자열 변경이 자주 일어나는 경우, 성능면에서 좋지 않음
        *          하지만, 변하지 않는 문자열을 자주 읽어야 하는 경우 오히려 좋은 성능을 기대할 수 있음
        *
        * StringBuilder = 가변이라는 특징을 갖는다.
        *                 문자열에 append() 메서드를 이용해 합치는 경우,
        *                 기존 인스턴스로 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
        *                 따라서 잦은 문자열 변경이 일어나는 경우 String 보다 성능이 좋다.
        *
        * 단, jdk 1.5 이후 버전에서는 문자열의 + 연산이 StringBuilder 의 append()로 컴파일된다.
        * 따라서 성능에 큰 차이를 보이지 않는다.
        *
        * 하지만, 반복문에서 문자열의 +연산을 수행하는 경우 StringBuilder 인스턴스를
        * 반복 루프 시 마다 생성하기 때문에 성능에는 좋지 않은 영향을 준다.
        *
        * -----------------------------------------------------------------------------------------
        *
        * String str1 = "java";
        * String str2 = "oracle";
        * String str3 = str1 + str2;
        * String str4 = "";
        * for(int i = 0; i < 10; i ++) {
        *       str4 += str1;
        *   }
        *
        * jdk 1.4 이하
        * -----------------------------------------------------------------------------------------
        * String str1 = "java";
        * String str2 = "oracle";
        * String str3 = str1 + str2;
        * String str4 = "";
        * for(int i = 0; i < 10; i ++) {
        *       str4 += str1;
        *   }
        *
        * jdk 1.5 이상
        * -----------------------------------------------------------------------------------------
        * String str1 = "java";
        * String str2 = "oracle";
        * String str3 = new StringBuilder(str1),append(str2).toString();
        * String str4 = "";
        * * for(int i = 0; i < 10; i++) {
        *       str4 += new StringBuilder(str4).append(str1).toString();
        *   }
        *
        * 직접 이용
        * ------------------------------------------------------------------------------------------
        *
        *
        *
        * */

        // StringBuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder("java");

        // toString 오버라이딩 되어있음.
        System.out.println("sb = " + sb);

        // hashCode 는 되어있지 않음
        System.out.println(sb.hashCode()); // 1096979270

        // 문자열 수정
        sb.append("oracle");

        System.out.println(sb); // javaoracle
        System.out.println(sb.hashCode()); // 1096979270

    }
}
