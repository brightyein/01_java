package main.java.com.ohgiraffers.section02.exception;

// 음수일 경우 예외처리
public class NegativeException extends Exception{

    public NegativeException(String message) {
        super(message);
    }
}
