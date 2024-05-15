package main.java.com.ohgiraffers.section03.dto;

public class MemberDto {

    //  회원 번호, 회원 명, 나이, 성별, 키, 업무기, 환성화여부 (Erue / false)
    //  계층간의 데이터 전송을 위해 사용되는 2체이다.

    private int memberId;
    private String name;
    private int age;
    private char gender;
    private double weight;
    private boolean isActivated;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
