package main.java.com.ohgiraffers.section03.stringBuilder;

public class Application02 {
    public static void main(String[] args) {

        StringBuilder sBuilder = new StringBuilder();

        /* capacity() :
        용량(현재 버퍼의 크기) 를 정수형으로 반환하는 메서드 (문자열 길이 + 16 이 기본 용량) */
        System.out.println(sBuilder.capacity()); // 16

        /*
        * append() : 인자로 전달된 값을 문자열로 반환 후 기존 문자열의 마지막에 추가한다.
        * 기본 용량을 초과하는 경우 (기존 문자열 +1) *2 를 하여 용량을 확장시킨다.
        *
        * */

        for (int i = 0; i < 50; i++) {
            sBuilder.append(i);

            System.out.println(sBuilder);
            System.out.println(sBuilder.capacity());
            System.out.println(sBuilder.hashCode());
            System.out.println("-----------------------");
        }

        // 새로운 인스턴스 생성
        StringBuilder sb2 = new StringBuilder("javaoracle");

        /*
        * delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        * deleteCharAt() : 문자열 인덱스를 이용해 문자 하나를 제거한다.
        * 둘 다 원본에 영향을 미친다.
        * */

        System.out.println("delete(2, 5) : " + sb2.delete(2,5)); // jaracle
        System.out.println("deleteCharAt(0 : " + sb2.deleteCharAt(0)); // aracle
        System.out.println("sb2 = " + sb2); // aracle

        /*
        * insert() : 인자로 전달된 값을 문자열로 변환 후 저장된 인덱스 위치에 추가한다.
        * 원본에 영향을 미친다.
        * */
        System.out.println("insert() : " + sb2.insert(1,"vao")); // avaoracle
        System.out.println("insert() : " + sb2.insert(0,"j")); // javaoracle
        System.out.println("insert() : " + sb2.insert(sb2.length(),"jdbc")); // javaoraclejdbc
        System.out.println("sb2 = " + sb2); // javaoraclejdbc

        /*
        * reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
        * 원본에 영향을 미친다.
        * */

        System.out.println("reverse() : " + sb2.reverse()); // cbdjelcaroavaj
        System.out.println("sb2 = " + sb2); // cbdjelcaroavaj

        /*
        * String 클래스와 동일한 메서드도 있다.
        * charAt() , indexOf() / lastIndexOf(), length(), replace(), subString(), toString())
        * */
    }
}
