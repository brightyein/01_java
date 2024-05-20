package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.memberDto.MemberDto;
import main.java.com.ohgiraffers.understand.memberRepository.MemberRepository;

public class GoogleAuth implements SnsAuth{

    MemberRepository memberRepository = new MemberRepository();

    @Override
    public boolean login(MemberDto memberDto) {

        System.out.println(memberDto.getMemberId() + "님 여기는 googleAuth 단계입니다. 인증중이니 조금만 기다려주세요.");

        if (memberRepository.checkAuth(memberDto) == true) {
            System.out.println("구글에 인증된 " + memberDto.getMemberId() + "님 환영합니다.");
            System.exit(0);
        } else
        System.out.println("구글에 인증된 회원이 없습니다.");
        return false;
    }
}
