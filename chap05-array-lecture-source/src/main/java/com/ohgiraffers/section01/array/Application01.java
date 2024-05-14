package main.java.com.ohgiraffers.section01.array;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 배열이란?
         *
         * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위함)
         * 배열은 heap 영역에 new 연산자를 이용하여 할당
         * 배열은 공간마다 찾아갈 수 있는 인덱스를 이용해 접근 가능
         *
         * <배열의 사용 이유>

         * 만약 배열을 사용하지 않는다면
         * 1. 여러개의 변수를 사용해야 함.
         * 2. 반복문을 이용한 연속 처리가 불가능.
         *
         * */

        // 배열을 사용하지 않는다면

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println(sum);

        // 배열의 선언
        int[] array = new int[5];

        // 배열의 접근
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[5] = 60;

        // 배열의 순회
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("array = " + sum2);
    }
}
