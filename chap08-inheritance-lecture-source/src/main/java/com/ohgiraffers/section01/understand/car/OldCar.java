package main.java.com.ohgiraffers.section01.understand.car;

public class OldCar extends Car{

    private String oilType;

    public OldCar(String brand, int price, String name, String oilType) {
        super(brand, price, name);
        this.oilType = oilType;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    // 판매 수수료를 반환하는 메서드
    @Override
    public double getPrice() {
        System.out.println("내연 기관 자동차의 판매가는 " + super.getPrice() + "원 입니다.\n");
        return super.getPrice() * 0.1;
    }

    @Override
    public String toString() {
        return "OldCar{" +
                "carName = " + super.getName() +
                "oilType='" + oilType + '\'' +
                '}';
    }
}
