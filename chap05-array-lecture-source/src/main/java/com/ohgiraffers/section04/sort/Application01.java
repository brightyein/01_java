package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        // 배열의인덱스에 있는 값도 서로 변경할 수 있다.
        int[] arr = {1,2,3};

        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {

        }
    }
}
