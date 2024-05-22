package main.java.com.ohgiraffers.section01;

public class RabbitFarm<T extends Rabbit> {

    // 제네릭 클래스에서만 인터페이스를 상속받아도 implement 가 아닌 extends 를 사용해야 한다
    // 두개를 상속받을 경우 & 로 추가

    private T animal;

    public RabbitFarm(T animal) {}

    public RabbitFarm() {
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
