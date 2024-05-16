package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {

    LoginRepository loginRepository = new LoginRepository();

    // 회원 가입
    public void signUp() {

        while (true) {

            Scanner sc = new Scanner(System.in);

            User user = new User();

            System.out.println("========== 회원 가입 ==========\n");
            System.out.println("사용하실 아이디를 입력해 주세요 : ");
            user.setId(sc.nextLine());
//            String userId = sc.nextLine();
//            boolean idUnique = loginRepository.isUserIdUnique(userId);
//
//            if (idUnique) {
//                user.setId(userId);
//            } else System.out.println("이미 가입된 아이디 입니다.");

            System.out.println("가입자의 이름을 입력해 주세요 : ");
            user.setName(sc.nextLine());

            System.out.println("사용하실 비밀번호를 입력해 주세요 : ");
            String firstPass = sc.nextLine();

            System.out.println("입력하신 비밀번호를 한번 더 입력해 주세요 : ");
            String secondPass = sc.nextLine();

            if (firstPass.equals(secondPass)) {
                user.setPwd(secondPass);
                loginRepository.save(user);
                break;

            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
            }
        }
    }

    // 로그인
    public void login() {

        if (loginRepository.showCount()==0) {
            System.out.println("가입한 회원이 없습니다.");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("========== 로그인 ==========\n");
        System.out.println("아이디 : ");
        String userId = sc.nextLine();

        System.out.println("비밀번호 : ");
        String userPwd = sc.nextLine();

        boolean success = loginRepository.successLogin(userId, userPwd);

        if (success == false) {
            login();
        } else System.exit(0);
    }
}
