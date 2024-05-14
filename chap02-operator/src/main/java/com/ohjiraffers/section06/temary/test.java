package main.java.com.ohjiraffers.section06.temary;

public class test {
    public static void main(String[] args) {

        /*
        * 영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점, 4번 학생은 88점을 맞았다.
        * 90-100 점 사이에 있는 학생은 합격, 아니라면 불합격을 출력하자.
        * */

        int st1 = 90;
        int st2 = 95;
        int st3 = 81;
        int st4 = 88;

        String result = (st1 >= 90 && st1 <= 100)? "합격" : "불합격";
        String result2 = (st2 >= 90 && st1 <= 100)? "합격" : "불합격";
        String result3 = (st3 >= 90 && st1 <= 100)? "합격" : "불합격";
        String result4 = (st4 >= 90 && st1 <= 100)? "합격" : "불합격";

        System.out.println("학생1은 " + result + ", 학생2는 " + result2 + ", 학생3은 " + result3 + ", 학생4는 " + result4);

    }
}
