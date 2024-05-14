package main.java.com.ohgiraffers.section02.demensional;

public class Application01 {
    public static void main(String[] args) {

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        // iarr1 = new int[][];
        // iarr1 = new int[][4];
        iarr1 = new int[3][]; // 여기서부터

        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        iarr2 = new int[3][5]; // 여기까지 크기가 같은 배열임을 표현

        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.println(iarr1[0][i] + " ");
        }
        for (int i = 0; i < iarr1[1].length; i++) {
            System.out.println(iarr1[1][i] + " ");
        }

        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.println(iarr1[i][j] + " ");
            }
        }

    }
}
