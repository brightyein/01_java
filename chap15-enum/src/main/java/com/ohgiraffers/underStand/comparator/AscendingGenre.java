package main.java.com.ohgiraffers.underStand.comparator;

import main.java.com.ohgiraffers.underStand.dto.BookDto;

import java.util.Comparator;

public class AscendingGenre implements Comparator<BookDto> {
    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
