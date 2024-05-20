package main.java.com.ohgiraffers.section04.use2;

public class Dicer {

    private int currentPosition;

    // 주사위 종류를 매개변수로 받아서 숫자 얻기
    public void throwDice(Dice dice) {
        int diceNumber = dice.getNumber();
        move(diceNumber);
        System.out.println(currentPosition + "만큼 이동하셨습니다.");
    }

    // 얻은 숫자를 현재 위치에 더해주기
    public void move(int diceNumber) {
        this.currentPosition += diceNumber;
    }
}
