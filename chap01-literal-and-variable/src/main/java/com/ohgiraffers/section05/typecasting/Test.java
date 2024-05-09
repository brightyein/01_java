package main.java.com.ohgiraffers.section05.typecasting;

public class Test {
    public static void main(String[] args) {

        /*
        * 5명의 학생이 있으며 학생의 키는 각각
        * 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수점 자리는 절삭)
        * 화면에 보여지는 양식은 다음과 같다.
        * 1반 학생 5명의 평균 키는 ()cm 이다.
        * */

        double st1 = 178.5;
        double st2 = 170.3;
        double st3 = 190.7;
        double st4 = 188.67;
        double st5 = 160.8;

        int avg = (int)(st1 + st2 + st3 + st4 + st5)/5;
        System.out.println("1반 학생 5명의 평균 키는 " + avg + "cm 이다.");

    }
}
