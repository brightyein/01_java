package main.java.com.ohjiraffers.section04.compairsion;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 비교 연산자 (==, !=, >, <, >=, <=)
        *
        * 비교 연산자는 피 연산자 사이에서 상대적인 크기를 판단하여,
        * 참 혹은 거짓을 반환하는 연산자이다.
        *
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이다.
        * 조건문의 조건절에 많이 쓴다.
        *
        * ! : 부정문을 의미
        * */

        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println("------------------정수 비교------------------");

        int inum1 = 10;
        int inum2 = 20;
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2)); // false
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2)); // true
        System.out.println("inum1이 inum2 보다 큰지 비교 : " + (inum1 > inum2)); // false
        System.out.println("inum1이 inum2 보다 작은지 비교 : " + (inum1 < inum2)); // true
        System.out.println("inum1이 inum2 보다 크거나 같은지 비교 : " + (inum1 >= inum2)); // false
        System.out.println("inum1이 inum2 보다 작거나 같은지 비교 : " + (inum1 <= inum2)); // true

        System.out.println("------------------문자값 비교------------------");

        // 아스키코드에 따르면
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 64
        System.out.println(ch1 == ch2); // false
        System.out.println(ch1 != ch2); // true
        System.out.println(ch1 > ch2); // true
        System.out.println(ch1 >= ch2); // true
        System.out.println(ch1 < ch2); // false
        System.out.println(ch1 <= ch2); // false

        System.out.println("------------------논리값 비교------------------");
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 == bool2); // false
        System.out.println(bool1 != bool2); // true
        // * 논리형은 대소 비교 불가

        System.out.println("------------------문자열 값 비교------------------");

        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2); // true
        System.out.println(str1 != str2); // false

        System.out.println("------------------------------------");

        int x = 10;
        int y = 11;

        boolean result = x <= y; // true
        System.out.println(result);



    }
}
