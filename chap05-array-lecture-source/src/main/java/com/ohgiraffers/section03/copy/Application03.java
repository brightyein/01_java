package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 깊은 복사는 heap 에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사해 놓는 것
        *
        * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        * 하나의
        * */

        /*
        * 깊은 복사를 하는 방법은 4가지가 있다.
        *
        * 1. for문을 이용한 동일 인덱스 복사
        * 2. object의 clone 을 이용한 복사
        * 3. System 의 arraycopy() 를 이용한 복사
        * 4. Array의 copyOf() 를 이용한 복사
        *
        * 이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메서드이다.
        * 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copy() 메서드이다.
        * clone()의 경우 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 갖는다.
        *
        * */

        int[] originArr = new int[]{1,2,3,4,5};
        print(originArr);

        /* 1. for 문을 이용한 동일한 인덱스 값 복사 */
        int[] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        /* 2. clone() 이용한 복사 */
        System.out.println("---------------- clone ----------------");
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        /* arrayCopy() 를 이용한 복사 */
        System.out.println("--------------- arrayCopy ---------------");
        int[] copyArr3 = new int[10];
        // (원본배열, 원본배열 시작인덱스, 새 배열, 복사시작 새배열 인덱스, 복사마무리 원본배열 인덱스)
        System.arraycopy(originArr,0,copyArr3,3,originArr.length);
        print(copyArr3);

        /* copyOf() 를 이용한 복사 */
        System.out.println("--------------- copyOf ---------------");
        // (원본배열, 새배열의 크기)
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);
        print(copyArr4);
    }

    public static void print(int[] arr) {
        System.out.println("arr 의 hashcode : " + arr.hashCode());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
