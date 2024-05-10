package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    // 둘 중 최솟값 리턴 메서드
    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }

    // 둘 중 최댓값을 리턴 메서드
    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }
}
