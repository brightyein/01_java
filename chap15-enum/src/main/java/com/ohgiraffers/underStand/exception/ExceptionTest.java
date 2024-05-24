package main.java.com.ohgiraffers.underStand.exception;

import main.java.com.ohgiraffers.underStand.dto.BookDto;
import main.java.com.ohgiraffers.underStand.genreEnum.Genre;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class ExceptionTest {

    public void checkDuplicateBookTitleException(String inputTitle, List<BookDto> totalBooks)
            throws DuplicateBookTitleException {

        for (BookDto book : totalBooks) {
            if (book.getTitle().equals(inputTitle)) {
                throw new DuplicateBookTitleException();
            }
        }
        System.out.println("등록이 가능한 책 입니다. " + inputTitle + " 의 동록을 계속 진행합니다.\n");
    }

    public void checkDuplicateBookNumberException(int inputBookNum, List<BookDto> totalBooks)
        throws DuplicateBookNumberException {

        for (BookDto totalBook : totalBooks) {
            if (totalBook.getBookNum() == inputBookNum) {
                throw new DuplicateBookNumberException();
            }
        }
        System.out.println("사용이 가능한 등록번호 입니다. " + inputBookNum + " 로 등록하겠습니다.\n");
    }

    public void checkInvalidGenreException(Genre inputGenre)
        throws InvalidGenreException {

        EnumSet<Genre> genres = EnumSet.allOf(Genre.class);

        Iterator<Genre> iterator = genres.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(inputGenre)) {
                return;
            }
        } throw new InvalidGenreException();
    }
}
