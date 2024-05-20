package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.memberDto.MemberDto;
import main.java.com.ohgiraffers.understand.memberRepository.MemberRepository;

public class KakaoAuth implements SnsAuth{

    MemberRepository memberRepository = new MemberRepository();

    @Override
    public boolean login(MemberDto memberDto) {

        if (memberRepository.checkAuth(memberDto) == true) {
            System.out.println("카카오에 인증된 " + memberDto.getMemberId() + "님 환영합니다.");
            return true;
        } else
        System.out.println("카카오에 인증된 회원이 없습니다.");
        return false;
    }
}
