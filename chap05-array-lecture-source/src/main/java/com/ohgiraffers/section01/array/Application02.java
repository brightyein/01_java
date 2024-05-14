package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*
         * 배열의 선언
         * 자료형[] 변수명; > 이 단계에서는 스택(stack) 영역에 주소값을 담을 공간이 생긴다!
         *
         * */

        int[] array1;
        int array[];

        /*
         * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
         * 발생한 주소를 레퍼런스 주소에 저장해 이것을 사용하기 때문에 참조자료형(reference type) 이라고 한다.
         * */

        // 배열을 할당할 경우, 반드시 크기 지정 필수!
        array1 = new int[5];
        array = new int[4];

        // 선언과 할당 동시에
        int[] array3 = new int[5];

        // 배열 자체를 출력 : stack 영역에 저장된 heap 영역의 주소값
        System.out.println(array1); // [I@4c873330
        System.out.println(array); // [I@119d7047
        System.out.println(array3); // [I@776ec8df

        // hashCode() : 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환
        System.out.println(array.hashCode());
        System.out.println(array1.hashCode());
        System.out.println(array3.hashCode());

        // 스캐너를 통해 입력 받은 정수로 배열 길이를 지정
        Scanner scr = new Scanner(System.in);
        System.out.println("생성할 배열의 크기를 입력해 주세요: ");
        int size = scr.nextInt();

        int[] darr = new int[size];

        System.out.println("darr의 length : " + darr.length);
        System.out.println("darr의 hashcode " + darr.hashCode());
        System.out.println("-----------------------------------------");

        // 다른 주소를 가진 새로운 배열을 생성 (기존 배열은 가비지 컬렉터가 수거해감)
        darr = new int[50];

        System.out.println("darr의 바뀐 length : " + darr.length);
        System.out.println("darr의 바뀐 hashcode " + darr.hashCode());
    }
}
