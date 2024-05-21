package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 모든 클래스는 Object 클래스의 후손이다.
        * 따라서 Object 클래스가 가진 메서드를 자신이 가진 것 처럼 사용할 수 있다.
        * 또한 부모 클래스가 가지는 메서드를 오버라이딩해서 사용하는 것도 가능한다.
        *
        * Object 클래스의 메서드 중 관례상 많이 오버라이딩 해서 사용하는 메서드들이 있다.
        * toString(), equals(), hashCode() 이다.
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        System.out.println("book1: " + book1.toString()); // book1 이라고 적으면 book1.toString() 과 같음. 생략된 것.
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book3);

    }
}
