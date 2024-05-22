package main.java.com.ohgiraffers.section01;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // 자기 자신과 후손만
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    // 자기 자신과 부모만
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
