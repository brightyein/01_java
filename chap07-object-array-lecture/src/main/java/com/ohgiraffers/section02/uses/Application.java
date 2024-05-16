package main.java.com.ohgiraffers.section02.uses;

/* 프로그램 실행부 */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
        * 시스템의 요구사항
        * 1. 여러명의 회원 정보를 받아 한번에 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러명의 회원 정보를 반환
        * 3. 회원 정보는 10명까지만 저장 가능.
        *
        * 1. 회원등록, 2. 회원전체조회, 9. 프로그램 종료, 그 외의 값 : 잘못된 번호를 입력하셨습니다.
        *
        * Application > MemberService > MemberRegister > MemberRepository
        *
        * */

        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        while(true) {
            System.out.println("========회원 관리 프로그램========\n");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원전체조회");
            System.out.println("9. 프로그램 종료 \n");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1: memberService.signUpMember(); break;
                case 2: memberService.showAllMembers(); break;
                case 9:
                    System.out.println("프로그램 종료"); return; // main 으로 돌아간다
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.\n"); break;
            }
        }

    }
}
