package main.java.com.ohgiraffers.section02.set.run;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        /*
         * SET 인터페이스를 구현한 Set 컬렉션 클래스
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 같은 요소의 중복 저장을 허용하지 않는다.
         *       (null 값도 중복하지 않게 하나만 저장함.)
         *
         * */

        /*
         * HashSet
         * set 컬렉션에서 가장 많이 사용되는 클래스 중 하나이다.
         *  jdk 1.2 부터 제공하고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
         *
         * */

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add(new String("java"));
        hashSet.add(new String("jdbc"));
        hashSet.add(new String("oracle"));
        hashSet.add(new String("css"));

        // hashSet.add("java"); : 중복 허용 X
        System.out.println(hashSet); // 순서 없음
        System.out.println(hashSet.size()); //4
        System.out.println(hashSet.contains("java")); // true
        System.out.println(hashSet.contains(new String("java"))); // true

        Object[] arr = hashSet.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
