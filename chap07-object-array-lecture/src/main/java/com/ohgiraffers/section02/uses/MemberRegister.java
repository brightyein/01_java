package main.java.com.ohgiraffers.section02.uses;

/* 회원 등록을 repository 에게 명령하는 클래스 */

public class MemberRegister {

    public void regist(Member[] members) {

        System.out.println("회원 등록을 시작합니다. \n");

        for (Member member : members) {
            System.out.println(member.getInfo() + "님을 회원 등록합니다.");
        }

        // repository 에 저장 명령을 보내고 결과를 출력
        if(MemberRepository.save(members)) {
            System.out.println("\n총 " + members.length + "명의 회원 등록에 성공했습니다.\n");
        } else System.out.println("인원이 마감되어 등록에 실패했습니다.");
    }
}
