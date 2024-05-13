package main.java.com.ohgiraffers.section01.array.question;

import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /* 배열의 최솟값, 최댓값 찾기
        *
        * 배열의 길이는 스캐너로 입력 받아서 요소마다 정수를 넣어줌.
        * 해당 배열의 최솟값과 최댓값을 출력해주는 기능을 만들어주세요.
        * */

        // 배열 길이 입력 받아 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("생성할 배열의 길이를 입력하시오 : ");
        int[] array = new int[sc.nextInt()];

        // 배열의 요소 값 입력 받기
        for (int i = 0; i < array.length; i++) {
            System.out.println("생성한 배열의 " + (i+1) + "번째 값을 입력해 주세요: ");
            array[i] = sc.nextInt();
        }

        // 최솟값과 최댓값 출력하기
        System.out.println("생성하신 배열은 : "+ Arrays.toString(array));
        System.out.println("-------------------------------------");
        System.out.println("생성한 배열의 요소 중 최솟값은 : " + min(array));
        System.out.println("생성한 배열의 요소 중 최댓값은 : " + max(array));
        System.out.println("-------------------------------------");

        // for 문으로 최솟값과 최댓값 출력하기
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("최솟값은 : " + min + " 최댓값은 : " + max);
        System.out.println("-------------------------------------");

        // 두번째 최댓값, 최솟값 구하기
        int secondMin = array[0];
        int secondMax = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] != min) {
                if (array[i] < secondMin) {
                    secondMin = array[i];
                }
            }

            if (array[i] != max) {
                if (array[i] > secondMax) {
                    secondMax = array[i];
                }
            }
        }
        System.out.println("두번째 최솟값은 : " + secondMin);
        System.out.println("두번째 최댓값은 : " + secondMax);
    }

    // 배열의 요소 중 최솟값 찾기
    public static int min(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    // 배열의 요소 중 최댓값 찾기
    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
