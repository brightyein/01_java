package main.java.com.ohgiraffers.understand.memberRepository;

import main.java.com.ohgiraffers.understand.memberDto.MemberDto;

public class MemberRepository {

    // 회원 가입
    private final static MemberDto[] singUpMembers = new MemberDto[10];
    private static int count;

    public void saveMember(MemberDto memberDto) {

        for (int i = 0; i < singUpMembers.length; i++) {
            if (singUpMembers[i] == null) {
                singUpMembers[i] = memberDto;
                break;
            }
        } count ++;

        System.out.println(memberDto.getMemberId()+"회원님, 회원 가입 성공!");
        System.out.println("회원님의 가입으로 지금까지 가입된 회원은 총" + count + "입니다.\n");
        for (int i = 0; i < singUpMembers.length; i++) {
            if (singUpMembers[i] == null) continue;
            System.out.println(singUpMembers[i].toString());
        }
    }

    // 인증 체크
    public boolean checkAuth(MemberDto memberDto) {
        System.out.println(memberDto.getMemberId() + "님 여기는 repo 의 checkAuth 단계입니다. 조금만 기다려주세요.");

        for (int i = 0; i < singUpMembers.length; i++) {
            if (singUpMembers[i] == null) continue;
            System.out.println(singUpMembers[i].toString());
        }

        for (int i = 0; i < singUpMembers.length; i++) {
            if (singUpMembers[i] == null) continue;
            if (memberDto.getLoginAuth().equals(singUpMembers[i].getLoginAuth())&& memberDto.getMemberId().equals(singUpMembers[i].getMemberId()) && memberDto.getMemberPwd().equals(singUpMembers[i].getMemberPwd())) {
                return true;
            }
        }
        return false;
    }
}
