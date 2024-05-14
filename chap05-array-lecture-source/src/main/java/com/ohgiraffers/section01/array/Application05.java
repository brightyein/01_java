package main.java.com.ohgiraffers.section01.array;

public class Application05 {
    public static void main(String[] args) {

        /* 랜덤한 트럼프카드 뽑기 */

        String[] shapes = {"SPADE", "HEART", "DIAMOND", "CLOVER"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int shapesNumber = (int)(Math.random() * shapes.length);
        int chNumber = (int)(Math.random() * number.length);

        System.out.println("트럼프카드 랜덤뽑기 결과는 : "+shapes[shapesNumber] + " " + number[chNumber]);
    }
}
