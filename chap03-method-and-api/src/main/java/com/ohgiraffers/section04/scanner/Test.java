package main.java.com.ohgiraffers.section04.scanner;

public class Test {

    // 양수 및 짝홀 판단 메서드 testRandomNum
    public String testRandomNum(int a) {

        String result = (a>0)? (a%2==0 ? (a+ "는 양수면서 짝수입니다.") : (a+ "는 양수면서 홀수입니다."))
                                :(a%2==0 ? (a+ "는 음수면서 짝수입니다.") : (a+ "는 음수면서 홀수입니다."));

        return result;
    }
}