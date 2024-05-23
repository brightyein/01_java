package main.java.com.ohgiraffers.section02;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-30000, -10000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
