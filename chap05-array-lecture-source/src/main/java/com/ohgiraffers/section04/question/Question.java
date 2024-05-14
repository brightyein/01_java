package main.java.com.ohgiraffers.section04.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
        * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
        * 상근이는 지금 사탕가게에 설탕을 정확히 N 킬로그램을 배달해야 한다.
        * 설탕공장에서 만드는 설탕은 봉지에 담겨있다.
        * 봉지는 3kg 봉지와 5kg 봉지가 있다.
        * 상근이는 귀찮기 때문에 최대한 적은 봉지를 들고 가려고 한다.
        *
        * 예를들어, 18kg 설탕을 배달해야 할 때, 3kg 봉지 6개를 가져가도 되지만
        * 5kg 3개와 3kg 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
        * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
        * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
        *
        * 처음에 Scanner 로 값을 입력 받는다.
        * 3 <= N <= 5000
        *
        * 상근이가 배달하는 봉지의 최소 개수를 출력한다.
        * 만약, 정확하게 Nkg 을 만들 수 없다면 -1을 출력한다.
        * */

        // 총 설탕 kg 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("배달을 원하는 설탕의 kg 를 입력하세요 : ");
        int needSugar = sc.nextInt();

        // 봉지수 초기화
        int sugarCount = 0;

        // 5kg 봉지 구하기
        if (needSugar < 5) {
            sugarCount = 0;
        } else sugarCount = needSugar/5;


        // 나머지 kg 구하기
        int remain = needSugar-(sugarCount*5);

        // 최종 봉지 수 출력
        if (remain % 3 != 0) {
            System.out.println(-1 + "/ 정확한 배달이 어렵습니다.");
        } else {
            sugarCount += (needSugar-(sugarCount*5))/3;
            System.out.println("총 " + (sugarCount) + "개의 봉지를 배달합니다.");
        }
    }
}
