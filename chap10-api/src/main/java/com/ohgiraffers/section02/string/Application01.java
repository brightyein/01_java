package main.java.com.ohgiraffers.section02.string;

public class Application01 {
    public static void main(String[] args) {

        // String 클래스의 자주 사용하는 메서드들에 대해 숙지하고 사용할 수 있다.

        /*
        * charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
        * 인덱스는 0 부터 시작
        * 인덱스를 벗어난 정수를 인자로 전달하면 IndexOutOfBoundException
        *
        * */

        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같다면 0 을 반환, 인자로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환
        * 단, 이 메서드는 대소문자를 구분하여 비교한다.
        *
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println(str2.compareTo(str3)); // 0
        System.out.println(str2.compareTo(str4)); // 양수
        System.out.println(str4.compareTo(str2)); // 음수
        System.out.println(str2.compareTo(str5)); // 음수
        System.out.println(str5.compareTo(str2));; // 양수

        System.out.println(str3.compareToIgnoreCase(str4)); // 0

        /*
        * concat() :  문자열에 인자로 전달된 문자열을 합쳐서 새로운 문자열을 반환한다.
        * 원본 문자열에는 영향을 주지 않는다.
        * */
        System.out.println(str2.concat(str5));
        System.out.println(str2); // 원본이 변하진 않는다

        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 변환
        * 단, 일치하는 문자가 없을 시 -1 을 반환
        * */
        System.out.println(str2.indexOf('j')); // 0
        System.out.println(str5.indexOf('a')); // 2

        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환
        * 단, 일치하는 문자가 없는 경우 -1 반환
        * */

        System.out.println(str2.lastIndexOf('a')); //3
        System.out.println(str5.lastIndexOf('A')); // -1

        /*
        * trim() : 문자열의 앞 뒤 공백을 제거한 문자열을 반환한다. (실행 후에도 원본은 변동X)
        * */

        String trimStr = "   java   ";
        System.out.println(trimStr);
        System.out.println(trimStr.trim());

        /*
        * toLowerCase() : 모든 문자를 소문자로 변환
        * toUpperCase() : 모든 문자를 대문자로 변환
        * 원본에는 영향을 주지 않음.
        * */

        String caseStr = "JavaOracle";
        System.out.println("toUpperCase() :"+caseStr.toUpperCase());
        System.out.println("toLowerCase() :"+caseStr.toLowerCase());
        System.out.println(caseStr);

        /*
        * subString() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환
        * */
        String javaOracle = "javaOracle";
        System.out.println(javaOracle.substring(3,6)); // aOr
        System.out.println(javaOracle.substring(3));

        /*
        * replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
        * 원본에 영향을 주지 않는다.
        * */

        System.out.println(javaOracle.replace("java", "python"));
        System.out.println(javaOracle);

        /*
        * length() : 문자열의 길이를 정수형으로 반환
        * */
        System.out.println(javaOracle.length()); // 10
        System.out.println("".length()); // 0

        /*
        * isEmpty() : 문자열의 길이가 0 이면, true 반환 아니면 false 반환
        * 길이가 0 인 문자열은 null 과 다르다.
        * */
        System.out.println("".isEmpty()); // true
        System.out.println("abc".isEmpty()); // false

    }
}
