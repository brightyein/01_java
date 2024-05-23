package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
         * Map 인터페이스의 특징
         *  Collection 인터페이스와는 다른 저장 방식을 가진다.
         * 키 와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         *  키(Key)란?
         *  값(value)을 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *   1. 요소의 저장 순서를 유지하지 않는다.
         *   2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값을 저장 가능하다.
         *
         *
         *  HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         *  HashMap 이 가장 많이 사용되며, HashTable은 jdk1.0 부터 제공되며
         *  HashMap 과 동일하게 작동된다. 하위 호환을 위해 남겨 놓았기 때문에
         *  가급적이면 HashMap을 사용하는 것이 좋다.
         *
         * */

        /*
         * HashMap
         *  jdk 1.2 부터 제공되는 클래스로 해쉬 알고리즘을 사용하여 검색 속도가 매우 빠르다.
         * */

        // HashMap 의 선언 방법
        HashMap hashMap = new HashMap();
        Map map = new HashMap();

        // HashMap 에 값 넣기
        hashMap.put("one", new Date());
        hashMap.put(12,"red apple");
        hashMap.put(33, 123);

        // key=value 로 출력됨
        System.out.println(hashMap);

        // key 중복 불가 (값 덮어씌움)
        hashMap.put(12,"yellow");
        System.out.println(hashMap);

        // value 중복 가능
        hashMap.put(11, "yellow banana");
        hashMap.put(9, "yellow banana");
        System.out.println(hashMap);

        // .get(key) : key 로 value 찾기
        System.out.println(hashMap.get(9));

        // .remove(key) : key 로 요소 삭제
        hashMap.remove(9);
        System.out.println(hashMap);

        // .size() : 요소의 갯수 확인
        System.out.println(hashMap.size());

        // key, value 의 타입을 지정하여 선언하기
        HashMap<String,String> hashMap2 = new HashMap();
        hashMap2.put("one", "java");
        hashMap2.put("two", "oracle");
        hashMap2.put("three", "jdbc");
        hashMap2.put("four", "html");
        hashMap2.put("five", "css");

        // HashMap 순회하기 _ iterator
        Iterator<String> ketIter = hashMap2.keySet().iterator();

        while (ketIter.hasNext()) {
            String key = ketIter.next();
            String value = hashMap2.get(key);
            System.out.println(key + " = " + value);
        }

        // ======== value 객체들만 values() 메서드로 Collection 으로 만듦 =========
        Collection<String> values = hashMap2.values();

        // 1. Iterator()
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        // 2. 배열로 처리
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " = " + valueArr[i]);
        }

        // 3. Map 의 내부 클래스인 EntrySet 이용
        // Entry : 키 객체와 값 객체를 쌍으로 묶은 것
        Set<Map.Entry<String,String>> set = hashMap.entrySet();

        Iterator<Map.Entry<String,String>> entryIterator = set.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
