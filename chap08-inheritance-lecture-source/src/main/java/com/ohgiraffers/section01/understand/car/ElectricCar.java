package main.java.com.ohgiraffers.section01.understand.car;

public class ElectricCar extends Car {

    private String energy;

    // 상속받아 쓸 때에도 반드시 생성자 필요
    public ElectricCar(String brand, int price, String name, String energy) {
        super(brand, price, name); // super : 부모
        this.energy = energy;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    // 부모의 getPrice 메서드 오버라이드
    @Override
    public double getPrice() {
        System.out.println("전기차의 판매가는 " + super.getPrice() + "원 입니다.\n");
        return super.getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carName = " + super.getName() +
                "energy='" + energy + '\'' +
                '}';
    }
}
