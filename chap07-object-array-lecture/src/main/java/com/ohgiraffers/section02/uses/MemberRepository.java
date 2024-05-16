package main.java.com.ohgiraffers.section02.uses;

/* DB 연결부 - 데이터 수행 */

public class MemberRepository {

    private final static Member[] members;

    // final static 으로 10명만 받을 수 있도록 고정
    static {members = new Member[10];}

    // 10명인지 세는 용도
    private static int count;

    // register 에서 member 배열과 함께 내려온 저장 명령을 수행하고 성공여부를 boolean 으로 반환하는 메서드
    public static boolean save(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {

            if (count != 10) {
                members[count++] = newMembers[i];

            } else {
                System.out.println("정원 초과");
                return false;
            }
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }

}
