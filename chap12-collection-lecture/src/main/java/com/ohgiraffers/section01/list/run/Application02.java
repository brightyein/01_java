package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingAuthor;
import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        List<BookDto> bookList = new ArrayList<>();

        bookList.add(new BookDto(1, "홍길동전", "허균", 30000));
        bookList.add(new BookDto(2, "목민심서", "정약용", 50000));
        bookList.add(new BookDto(3, "동의보감", "허춘", 40000));
        bookList.add(new BookDto(4, "삼국사기", "김부식", 55000));
        bookList.add(new BookDto(5, "삼국유사", "일연", 58000));

        // 기준이 모호한 객체는 sort 로 정렬할 수 없음
        // Collections.sort(bookList);

        for (BookDto bookDto : bookList) {
            System.out.println(bookDto);
        }
        System.out.println();

        // implements Comparator
        System.out.println("가격 오름차순 정렬 =================================");
        bookList.sort(new AscendingPrice());
        for (BookDto bookDto : bookList) {
            System.out.println(bookDto);
        }
        System.out.println();

        System.out.println("책 제목을 기준으로 오름차순 정렬 =========================");
        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for (BookDto bookDto : bookList) {
            System.out.println(bookDto);
        }
        System.out.println();

        System.out.println("작가를 기준으로 오름차순 정렬 =============================");
        bookList.sort(new AscendingAuthor());
        for (BookDto bookDto : bookList) {
            System.out.println(bookDto);
        }
    }
}
