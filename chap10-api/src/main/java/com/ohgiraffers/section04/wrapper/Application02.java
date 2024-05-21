package main.java.com.ohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {

        /* parsing : 문자열 (String) 으로 받은 값을 기본 자료형으로 변경하는 것 */
        byte b = Byte.parseByte("1");
        short s= Short.parseShort("2");
        int i = Integer.parseInt("3");
        long l = Long.parseLong("4");
        float f = Float.parseFloat("5.0");
        double d = Double.parseDouble("6.0");
        boolean bl = Boolean.parseBoolean("true");

        // char 는 parsing 을 제공하지 않는다. 대신 charAt()
        char c = "abc".charAt(0);
    }
}
