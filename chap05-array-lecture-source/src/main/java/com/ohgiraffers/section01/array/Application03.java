package main.java.com.ohgiraffers.section01.array;

public class Application03 {
    public static void main(String[] args) {

        /* 배열이 초기화되는 기본값을 자료형별로 이해할 수 있다. */

        /*
         * <값의 형태 별 기본값>

         * 정수 : 0
         * 실수 : 0.0
         * 논리형 : false
         * 문자 : \u0000
         *
         * */

        int[] iarr = new int[2];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarray[" + i + "] = " + iarr[i]);
        }

        double[] darr = new double[3];
        for (int i = 0; i < darr.length; i++) {
            System.out.println("darr[" + i + "] = " + darr[i]);
        }

        String[] strarr = new String[3];
        for (int i = 0; i < strarr.length; i++) {
            System.out.println("strarr[" + i + "] = " + strarr[i]);
        }

        /* 기본값 외의 값으로 직접 초기화 하고싶은 경우 블럭을 이용한다.
         * 블럭을 사용하는 경우, new 연산자를 생략이 가능하며, 값의 갯수만큼 자동으로 크기가 설정됨. */

        int[] iarr2 = {11, 22, 33, 44, 55};
        int[] iarr3 = new int[]{11, 22, 33, 44, 55};

        System.out.println("iarr2 주소 = " + iarr2.hashCode());
        System.out.println("iarr3 주소 = " + iarr3.hashCode());

        System.out.println("iarr2 길이 = " + iarr2.length);
        System.out.println("iarr3 길이 = " + iarr3.length);

        String[] sarr = {"apple", "banana", "grape", "orange"};
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] = " + sarr[i]);
        }
    }
}
