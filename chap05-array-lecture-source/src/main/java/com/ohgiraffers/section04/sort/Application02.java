package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        // 순차 정렬

        // 초기 배열 선언
        int[] iarr = {2,5,4,6,1,3};

        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (iarr[i] < iarr[j]) { // 앞 인덱스 값이 더 클 경우
                    int temp;
                    temp = iarr[i]; // i 를 변수에 옮긴뒤
                    iarr[i] = iarr[j]; // 전 인덱스로 i 인덱스값을 옮긴다
                    iarr[j] = temp; // 그리고 j 인덱스 값은
                }
            }
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
