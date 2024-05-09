package main.java.com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {

        int inum = 298;
        byte bnum = (byte) inum; // 오버플로우 발생
        System.out.println(bnum);

        double height = 178.5;
        int floorHeight = (int) height;
        System.out.println(height); // 178.5
        System.out.println(floorHeight); // 178

    }
}
