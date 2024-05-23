package main.java.com.ohgiraffers.section03.map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapQuestion {

    // 몇 번 구했는지
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    // 몇 가지 케이스를 계산할건지
    static int totalCase = sc.nextInt();


    public static void main(String[] args) {


    }

    // 입력받는 메서드
    public static Map<String, String> inputInfo() {

        // case1 의 의상 갯수
        int case1Clothes = sc.nextInt();
        sc.nextLine();

        Map<String, String> clothesMap1 = new HashMap<String, String>();

        for (int i = 0; i < case1Clothes; i++) {

            // 공백을 기준으로 잘라서 Map 에 담는다
            String[] split = sc.nextLine().split(" ");

            // key : 의상이름 , value : 의상종류
            clothesMap1.put(split[0], split[1]);
        }
        return clothesMap1;
    }

    // 경우의 수 세는 메서드
    public static void checkCase(Map<String, String> clothesMap1) {
        // key : value , value : 갯수 (같은 의상 종류가 몇개인지 세어 맵으로 저장)
        Map<String, Long> valueCountMap = clothesMap1.values().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (valueCountMap.size() == 1) {
            System.out.println(case1Clothes);
            count++;

        } else {

            long result = 1;
            for (Map.Entry<String, Long> entry : valueCountMap.entrySet()) {

                result *= (entry.getValue()); // 경우의 수 곱
            } System.out.println(result + case1Clothes);

            count++; // case 처리 횟수 카운트
        }

    }
}
