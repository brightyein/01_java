package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.memberDto.MemberDto;

public interface SnsAuth {

    boolean login(MemberDto memberDto);
}
