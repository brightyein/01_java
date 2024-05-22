package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDto;

import java.util.Comparator;

public class AscendingAuthor implements Comparator<BookDto> {

    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

