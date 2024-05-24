package main.java.com.ohgiraffers.underStand.dto;

public class BookDto {

    private String title;

    private  String author;

    private int bookNum;

    private Enum genre;

    private boolean isRental = true;

    public BookDto() {
    }

    public BookDto(String title, String author, int bookNum, Enum genre, boolean isRental) {
        this.title = title;
        this.author = author;
        this.bookNum = bookNum;
        this.genre = genre;
        this.isRental = isRental;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public Enum getGenre() {
        return genre;
    }

    public void setGenre(Enum genre) {
        this.genre = genre;
    }

    public boolean isRental() {
        return isRental;
    }

    public void setRental(boolean rental) {
        isRental = rental;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookNum=" + bookNum +
                ", genre=" + genre +
                ", isRental=" + isRental +
                '}';
    }
}
