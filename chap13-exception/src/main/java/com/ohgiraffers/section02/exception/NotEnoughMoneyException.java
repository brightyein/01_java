package main.java.com.ohgiraffers.section02.exception;

// 가진돈이 부족할 경우 예외처리
public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
