package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 배열의 복사는 크게 두 가지 종류가 있다.
        * 1. 얕은 복사(shadow copy) : stack 의 주소값만 복사
        * 2. 깊은 복사(deep copy) : heap 의 배열에 저장된 값을 복사
        * */

        /*
        * <얕은 복사>
        *
        * stack 에 저장되어 있는 배열의 주소값만 복사한다는 것
        * 따라서 두 개의 변수는 동일한 주소값을 가지고 있다.
        *
        * 하나의 변수에 저장된 주소값을 가지고 배열의 내용을 수정하게 되면
        * 다른 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어있다.
        *
        * */

        // 얕은복사
        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr;

        // 동일한 주소값
        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        // 향상된 for문
        for (int x : originArr) {
            System.out.print(x);
        }
        System.out.println();

        for (int x : copyArr) {
            System.out.print(x);
        }
        System.out.println();

        // 둘 중 하나의 배열 값 변경해보기 > 둘 다 변경됨
        copyArr[0] = 99;

        for (int x : originArr) {
            System.out.print(x);
        }
        System.out.println();

        for (int x : copyArr) {
            System.out.print(x);
        }
        System.out.println();
    }
}
