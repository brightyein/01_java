package main.java.com.ohgiraffers.section05.calender;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Date 클래스
        * jdk 1.0 부터 날짜를 취급하기 위해 사용되던 date 클래스는
        * 생성자를 비롯해 대부분의 메서드가 deprecated 되어 있다.
        *
        * Deprecated?
        * 향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는단 의미
        * 하지만 하위 버전의 호환성 때문에 한번에 제거되는 것은 아니고 남겨두었기 때문에 사용하는 것이 가능
        *
        * jdk 1.1 부터는 새롭게 제공되는 calender 클래스를 이용해 날짜와 시간에 관한 처리를 하게된다.
        * 하지만 calender 클래스는 몇 가지 문제를 갖고 있다.
        *
        * 1. Calender 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
        *
        * 2. 윤초(leep second) 는 고려하지 않는다.
        *
        *    윤초란? 협정 세계시에서 사용하는 세슘 원자 시계와 실제 지구 자전/공전 속도를 기준으로 한 태양시의 차이로 인해
        *    발생한 오차를 보정하기 위해 추가하는 1초이다.
        *    12월 31일 마지막에 추가하거나 혹은 6월 30일의 마지막에 추가된다.
        *    윤쵸는 사소해 보이지만 실제 2012년 링크드인과 같은 대규모 서비스의 서버를 마비시킨 버그를 발생시킨 적도 있다.
        *
        * 3. Calender 클래스는 월을 0 부터 11 까지 표현하는 불편함이 있다.
        *
        * jdk 8 부터는 이런 문제를 해결할 수 있는 time 패키지를 제공하고 있다.
        * */

        Date today = new Date();

        System.out.println(today); // 컴퓨터 시간 기준으로 현재 시간이 출력됨

        System.out.println(today.getTime()); // 시간을 밀리세컨드 숫자로 표현해서 보여줌 (5000이 약 5초)

        Date time = new Date(1716270825621L); // 다시 복구
        System.out.println(time);
    }
}
