package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        // 변수의 두 값을 변경하는 방법에 대해 이해할 수 있다.

        int num1 = 10;
        int num2 = 20;

        int temp;
        temp = num1; // temp = 10
        num1 = num2; // num1 = 20
        num2 = temp; // num2 = 10

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


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
