package main.java.com.ohgiraffers.underStand.repository;

import main.java.com.ohgiraffers.underStand.dto.BookDto;
import main.java.com.ohgiraffers.underStand.genreEnum.Genre;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    // 현재 도서관에 있는 모든 도서
    public List<BookDto> totalBooks = new ArrayList<>();

    // 도서 등록
    public void save(BookDto bookDto) {
        totalBooks.add(bookDto);
        System.out.println(bookDto.toString() + "의 도서 등록이 완료되었습니다.");
    }

    // 특정 장르의 도서만 조회
    public List<BookDto> getChoiceGenreBooks(Genre inputGenre) {

        // 선택 장르로 추린 도서를 담을 배열
        List<BookDto> resultBooks = new ArrayList<>();

        for (BookDto book : totalBooks) {
            if (book.getGenre().equals(inputGenre)) {
                resultBooks.add(book);
            }
        }
        return resultBooks;
    }

}
