package main.java.com.ohgiraffers.question;

public class BookDto {
    private String title;
    private String category;
    private String author;
    private int price;
    private double discountRate;

    // 기본 생성자
    public BookDto() {
    }

    // 필드값 3개 초기화하는 생성자
    public BookDto(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 모든 필드값을 초기화하는 생성자
    public BookDto(String title, String category, String author, int price, double discountRate) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    // 필드값 출력 메서드
    public String getInformation() {
        return "title : " + title + ", category : " + category+ ", author : "
                + author+ ", price : " + price + ", discountRate : " + discountRate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
