package main.java.com.ohgiraffers.section03;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    UserRole1() {
    }

    public String getNameToLowerCase() {
        return this.name().toLowerCase(); // this.name : enum 값들의 이름을 의미
    }
}
