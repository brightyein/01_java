package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.auth.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.NaverAuth;
import main.java.com.ohgiraffers.understand.memberDto.MemberDto;
import main.java.com.ohgiraffers.understand.memberService.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();
        GoogleAuth googleAuth = new GoogleAuth();
        KakaoAuth kakaoAuth = new KakaoAuth();
        NaverAuth naverAuth = new NaverAuth();

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n======== 로그인 메뉴 ========");
            System.out.println("1. 구글 인증 로그인");
            System.out.println("2. 카카오 인증 로그인");
            System.out.println("3. 네이버 인증 로그인");
            System.out.println("4. 회원 가입 로그인");

            System.out.println("\n메뉴 선택 : ");

            int selectAuth = sc.nextInt();

            switch (selectAuth) {

                case 1 : MemberDto googleLoginMember = input("구글");
                         System.out.println(googleLoginMember.getMemberId()+" 님의 구글 인증을 시작합니다.");
                         memberService.login(googleLoginMember, googleAuth);
                         break;

                case 2 : MemberDto kakaoLoginMember = input("카카오");
                         memberService.login(kakaoLoginMember, kakaoAuth);
                         break;

                case 3 : MemberDto naverLoginMember = input("네이버");
                         memberService.login(naverLoginMember, naverAuth);
                         break;

                case 4 : memberService.signUp(inputSingUpInfo()); break;

                default: System.out.println("잘못된 번호 입니다. 다시 입력해 주세요."); break;
            }
        }
    }

    // 회원가입 정보 입력받는 메서드
    public static MemberDto inputSingUpInfo() {

        MemberDto memberDto = new MemberDto();
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디를 입력해 주세요.");
        memberDto.setMemberId(sc.nextLine());

        System.out.println("비밀번호를 입력해 주세요. ");
        memberDto.setMemberPwd(sc.nextLine());

        System.out.println("=== 가입 인증 방식을 선택해 주세요. ===");
        System.out.println("1. 구글 인증");
        System.out.println("2. 카카오 인증");
        System.out.println("3. 네이버 인증");

        switch (sc.nextInt()) {
            case 1: memberDto.setLoginAuth("구글"); break;
            case 2: memberDto.setLoginAuth("카카오"); break;
            case 3: memberDto.setLoginAuth("네이버"); break;
            case 4:
                System.out.println("잘못된 번호 입니다. 다시 입력해 주세요."); break;
        }

        return memberDto;
    }

    // 아이디 비밀번호만 입력 받는 메서드
     public static MemberDto input(String auth) {
         MemberDto memberDto = new MemberDto();
         memberDto.setLoginAuth(auth);
         Scanner sc = new Scanner(System.in);

         System.out.println("아이디를 입력해 주세요.");
         memberDto.setMemberId(sc.nextLine());

         System.out.println("비밀번호를 입력해 주세요. ");
         memberDto.setMemberPwd(sc.nextLine());

         return memberDto;
     }


}
