package main.java.com.ohgiraffers.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;

        System.out.println(admin); // ADMIN
        System.out.println(admin.getNameToLowerCase()); // admin
        System.out.println(admin.name()); // ADMIN

        System.out.println(admin.hashCode()); // 295530567
        System.out.println(UserRole1.GUEST.hashCode()); // 2003749087

        // -------------------------------------------------------------------

        UserRole2 consumer = UserRole2.CONSUMER;

        System.out.println(consumer.getDescription()); // 구매자
        System.out.println(consumer.name()); // CONSUMER
        System.out.println(consumer.ordinal()); // 1

        UserRole2 consumer2 = UserRole2.CONSUMER;

        if (consumer2 == consumer) {
            System.out.println("동일 비교 == 가 true");
        }

        if (consumer2.equals(consumer)) {
            System.out.println(".equals 가 true");
        }

        if (consumer2.hashCode() == consumer.hashCode()) {
            System.out.println(".hashCode() 값이 같다");
        }

        // -----------------------------------------------------------------

        // EnumSet 을 활용해 여러 열거형 타입을 set 으로 취급 가능하다
        System.out.println("=======================================");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iterator = roles.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name());
        }

        // 특정 상수만 골라서 set 에 추가할 수 있다.
        System.out.println("=======================================");
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter = users.iterator();
        while (userIter.hasNext()) {
            UserRole2 role = userIter.next();
            System.out.println(role.ordinal() + ". " + role.getDescription());
        }

        // 특정 상수를 제외하여 set 에 추가할 수 있다.
        System.out.println("=======================================");
        EnumSet<UserRole2> users2 = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> users2Iter = users2.iterator();
        while (users2Iter.hasNext()) {
            UserRole2 role2 = users2Iter.next();
            System.out.println(role2.ordinal() + ". " + role2.getDescription());
        }
    }
}
