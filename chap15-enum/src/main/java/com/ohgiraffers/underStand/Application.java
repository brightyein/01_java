package main.java.com.ohgiraffers.underStand;

import main.java.com.ohgiraffers.underStand.dto.BookDto;
import main.java.com.ohgiraffers.underStand.repository.Repository;
import main.java.com.ohgiraffers.underStand.service.Library;

import java.util.Scanner;

import static main.java.com.ohgiraffers.underStand.genreEnum.Genre.*;

public class Application {
    public static void main(String[] args) {

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("============ 도서 관리 시스템 ============");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 목록 조회 (장르별)");
            System.out.println("3. 도서 대여");
            System.out.println("4. 도서 반납");
            System.out.println("5. 프로그램 종료\n");

            switch (sc.nextInt()) {
                case 1 : library.createBook(); break;

                case 2 :
                    System.out.println("어떤 장르의 도서를 조회할까요? : ");
                    System.out.println("1. MYSTERY, 2. NONFICTION, 3. SCIENCE, 4. HISTORY, 5. FANTASY, 6. MYSTERY");
                    System.out.println(library.getBooks(sc.nextInt()));
                    sc.nextLine(); break;

                case 3 :
                    System.out.println("대여하실 도서명을 입력해 주세요. : ");
                    sc.nextLine();
                    library.rentBook(sc.nextLine()); break;

                case 4 :
                    System.out.println("반납하실 도서명을 입력해 주세요. : ");
                    library.returnBook(sc.nextLine()); break;

                case 5 : return;
            }
        }

    }
}
