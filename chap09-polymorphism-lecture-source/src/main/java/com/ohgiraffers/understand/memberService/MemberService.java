package main.java.com.ohgiraffers.understand.memberService;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.memberDto.MemberDto;
import main.java.com.ohgiraffers.understand.memberRepository.MemberRepository;

import java.util.Scanner;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();


    public void login(MemberDto memberDto, SnsAuth snsAuth) {
        snsAuth.login(memberDto);
    }

    public void signUp(MemberDto memberDto) {
        memberRepository.saveMember(memberDto);
    }

}
