package main.java.com.ohgiraffers.question;

public class Question {
    public static void main(String[] args) {
        /*
        * BookDTO - 책 제목, 종류, 작가, 가격, 할인률
        * getter , setter , 생성자
        *
        * 기본 생성자를 이용한 인스턴스 생성 후 필드 값 출력
        * 필드 3가지를 초기화하는 생성자를 사용해 인스턴스 생성 후 필드 값 출력
        * 모든 필드를 초기화하는 생성자 사용해 인스턴스 생성 후 필드값 출력
        *
        * */

        // 기본 생성자
        BookDto bookDto1 = new BookDto();
        bookDto1.setCategory("소설");
        System.out.println(bookDto1.getInformation());

        // 매개변수 3개 생성자
        BookDto bookDto2 = new BookDto("흥부와 놀부", "김예인", 9000);
        System.out.println(bookDto2.getInformation());

        // 전체 필드 초기화 생성자
        BookDto bookDto3 = new BookDto("콩쥐 팥쥐", "동화", "김해중", 5800, 50);
        System.out.println(bookDto3.getInformation());
    }
}
