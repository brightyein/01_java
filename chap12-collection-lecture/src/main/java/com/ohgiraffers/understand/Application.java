package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Map buyLotto = new HashMap(); // key: 로또번호배열, value: 구매자

        Scanner sc = new Scanner(System.in);

        int count = 10; // 10장 구매제한

        while (true) {

            System.out.println("구매자의 이름을 입력하세요."); // key
            String name = sc.nextLine();

            System.out.println("몇 장 구매하시겠습니까?"); // value
            int n = sc.nextInt();
            sc.nextLine();

            // 갯수만큼 로또 생성 후 구매 가능 로또 업데이트
            for (int i = 0; i < n; i++) {
                buyLotto.put(createLotto(), name);
            } count -= n;

            System.out.println("남은 로또 갯수는 : "  + count + " 개 입니다.");

            System.out.println(buyLotto);

            // 10장 소진 시 추첨
            if (count == 0) {
                checkLotto(buyLotto);
                return;
            }
        }
    }

    // 로또 번호 생성기
    public static List createLotto() {

        List<Integer> lotto = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            lotto.add((int) (Math.random()*45)+1);
        } return lotto;
    }

    // 로또 당첨 확인
    public static void checkLotto(Map buyLotto) {

        List<Integer> realLotto = createLotto(); // 먼저 로또 결과를 추첨
        System.out.println("이번 회차의 당첨 번호는 : " + realLotto);

        // 맵의 key 와 realLotto 를 비교 (Iterator 를 사용)
        for (Object key : buyLotto.keySet()) {
            if (key == realLotto) {
                System.out.println("당첨번호 : " + key);
                System.out.println("당첨자는 : " + buyLotto.get(key));
            }
        } System.out.println("이번 회차 당첨 없음.");
    }
}
