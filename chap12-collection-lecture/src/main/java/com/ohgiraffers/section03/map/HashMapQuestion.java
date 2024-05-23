package main.java.com.ohgiraffers.section03.map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 몇 번 구했는지
        int count = 0;

        // 몇 가지 케이스를 계산할건지
        int totalCase = sc.nextInt();

        while (count != totalCase) {

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

            // key : value , value : 갯수
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
}
