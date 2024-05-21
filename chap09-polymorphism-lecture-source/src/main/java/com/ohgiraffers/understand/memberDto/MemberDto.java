package main.java.com.ohgiraffers.understand.memberDto;

public class MemberDto {

    private String memberId;

    private String memberPwd;

    private String loginAuth;

    public MemberDto() {}

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getLoginAuth() {
        return loginAuth;
    }

    public void setLoginAuth(String loginAuth) {
        this.loginAuth = loginAuth;
    }

    @Override
    public String toString() {
        return "MemberDto [memberId=" + memberId + ", memberPwd=" + memberPwd + ", loginAuth=" + loginAuth + "]";
    }
}
