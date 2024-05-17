package main.java.com.ohgiraffers.section02;

public class ServerClass extends SuperClass{

//    @Override
//    public void method2(int num) {} : 메서드 이름이 달라서 에러

//    @Override
//    public int method(int num) {} : 리턴 타입이 달라서 에러

//    @Override
//    public void method(int num, int num2) {} : 시그니처가 달라서 에러

    @Override
    public void method(int num) {
        super.method(num);
    }

//    @Override
//    public void privateMethod(){} : private 이라서 에러

//    @Override
//    public final void finalMethod() {} : final 이라서 에러

    @Override
    public void protectedMethod() {

    }
}
