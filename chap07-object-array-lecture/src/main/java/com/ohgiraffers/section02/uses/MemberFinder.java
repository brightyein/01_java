package main.java.com.ohgiraffers.section02.uses;

/* 회원을 조회하겠단 명령을 repository 에게 내리는 클래스 */

public class MemberFinder {

    public Member[] finderAllMembers() {

        return MemberRepository.findAllMembers();
    }



}
