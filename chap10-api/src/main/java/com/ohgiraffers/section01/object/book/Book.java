package main.java.com.ohgiraffers.section01.object.book;

public class Book {

    private int number;

    private String title;

    private String author;

    private int price;

    @Override
    public String toString() {
        return "Book [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) { // 주소값이 같으면 true
            return true;
        }

        Book other = (Book)obj; // 객체를 Book 자료형으로 바꿔줘서 Book의 메서드를 사용할 수 있도록

        if(this.number != other.number) {
            return false;
        }

        if (this.title == null) {

            if (other.title != null) {
                return false;
            }

        } else if (!this.title.equals(other.title)) {
            return false;
        }

        if (this.author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!this.author.equals(other.author)) {
            return false;
        }

        if (this.price != other.price) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.price;

        return result;
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
        super(); // 이거 적지 않아도 생략되어 있는 것
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
