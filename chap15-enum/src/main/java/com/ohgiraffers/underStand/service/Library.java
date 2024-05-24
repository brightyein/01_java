package main.java.com.ohgiraffers.underStand.service;

import main.java.com.ohgiraffers.underStand.dto.BookDto;
import main.java.com.ohgiraffers.underStand.exception.DuplicateBookNumberException;
import main.java.com.ohgiraffers.underStand.exception.DuplicateBookTitleException;
import main.java.com.ohgiraffers.underStand.exception.ExceptionTest;
import main.java.com.ohgiraffers.underStand.exception.InvalidGenreException;
import main.java.com.ohgiraffers.underStand.genreEnum.Genre;
import main.java.com.ohgiraffers.underStand.repository.Repository;

import java.util.List;
import java.util.Scanner;

public class Library {

    Repository repository = new Repository();
    ExceptionTest et = new ExceptionTest();
    Scanner sc = new Scanner(System.in);

    // 1. 도서 추가 기능
    public void createBook() {
        BookDto bookDto = new BookDto();

        // title 중복 예외처리
        while (true) {
            System.out.println("등록 할 도서의 제목을 입력해 주세요. : ");
            String inputTitle = sc.nextLine();

            try {
                et.checkDuplicateBookTitleException(inputTitle, repository.totalBooks);
                bookDto.setTitle(inputTitle);
                break;

            } catch (DuplicateBookTitleException e) {
                System.out.println("이미 등록된 도서입니다. 다시 입력해 주세요.");
            }
        }

        System.out.println("등록 할 도서의 작가를 입력해 주세요. : ");
        bookDto.setAuthor(sc.nextLine());

        // 도서 등록 번호 중복 체크
        while (true) {
            System.out.println("등록 할 도서의 등록 번호를 입력해 주세요. : ");
            int inputBookNum = sc.nextInt();
            sc.nextLine();

            try {
                et.checkDuplicateBookNumberException(inputBookNum, repository.totalBooks);
                bookDto.setBookNum(inputBookNum);
                break;

            } catch (DuplicateBookNumberException e) {
                System.out.println("이미 사용중인 등록번호 입니다." + inputBookNum + "과 다른 등록번호를 다시 입력해 주세요.");
            }
        }

        // 장르 유효성 체크 예외처리
        while (true) {

            System.out.println("등록 할 도서의 장르를 선택해 주세요. : ");
            System.out.println("1. MYSTERY, 2. NONFICTION, 3. SCIENCE, 4. HISTORY, 5. FANTASY, 6. MYSTERY");

            int inputBookGenreNum = sc.nextInt();
            sc.nextLine();
            Genre inputGenre = null;

            switch (inputBookGenreNum) {
                case 1:
                    inputGenre = Genre.FICTION;
                    break;
                case 2:
                    inputGenre = Genre.NONFICTION;
                    break;
                case 3:
                    inputGenre = Genre.SCIENCE;
                    break;
                case 4:
                    inputGenre = Genre.HISTORY;
                    break;
                case 5:
                    inputGenre = Genre.FANTASY;
                    break;
                case 6:
                    inputGenre = Genre.MYSTERY;
                    break;
            }

            try {
                et.checkInvalidGenreException(inputGenre);
                System.out.println("선택하신 " + inputGenre + " 장르로 등록합니다.\n");
                bookDto.setGenre(inputGenre);
                repository.save(bookDto);
                break;

            } catch (InvalidGenreException e) {
                System.out.println("등록할 수 없는 장르입니다. 다시 선택해 주세요.");
            }
        }
    }

    // 2. 도서 대여
    public void rentBook(String title) {
        for (BookDto book : repository.totalBooks) {

            if (book.getTitle().equals(title) && book.isRental()==true) {
                book.setRental(false);
                System.out.println("대여가 완료되었습니다.\n");

            } else if (book.isRental() == false) {
                System.out.println("이미 대여중인 책입니다.\n");

            } else System.out.println("도서관에 없는 도서입니다\n");
        }
    }


    // 3. 도서 반납
    public void returnBook(String title) {
        for (BookDto book : repository.totalBooks) {

            if (book.getTitle().equals(title) && book.isRental()==false) {
                book.setRental(true);
                System.out.println("반납이 완료되었습니다.\n");

            } else if (book.isRental() == true) {
                System.out.println("빌리신 책이 아닙니다.\n");

            } else System.out.println("도서관에 없는 도서입니다\n");
        }
    }


    // 4. 도서 조회 (장르별)
    public List<BookDto> getBooks(int inputGenreNum) {

        while (true) {

            Genre inputGenreToGet = null;

            switch (inputGenreNum) {
                case 1:
                    inputGenreToGet = Genre.FICTION;
                    break;
                case 2:
                    inputGenreToGet = Genre.NONFICTION;
                    break;
                case 3:
                    inputGenreToGet = Genre.SCIENCE;
                    break;
                case 4:
                    inputGenreToGet = Genre.HISTORY;
                    break;
                case 5:
                    inputGenreToGet = Genre.FANTASY;
                    break;
                case 6:
                    inputGenreToGet = Genre.MYSTERY;
                    break;
            }

            try {
                et.checkInvalidGenreException(inputGenreToGet);

                // 이곳에 선택한 장르의 도서만 보여주는 코드 작성
                return repository.getChoiceGenreBooks(inputGenreToGet);

            } catch (InvalidGenreException e) {
                System.out.println("조회할 수 없는 장르입니다. 다시 선택해 주세요.");
            }
        }

    }
}
