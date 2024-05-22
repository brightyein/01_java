package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDto;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDto> {

    // 오름차순 (양수 음수만 바꿔주면 내림차순)
    @Override
    public int compare(BookDto o1, BookDto o2) {
        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            result = 1; // 1 이면 순서 바꿈

        } else if (o1.getPrice() < o2.getPrice()) {
            result = -1; // -1 이면 그대로 둠

        } else result = 0;

        return result;
    }
}
