package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {

        // 예외처리가 자주 사용되는 io 패키지에서 예외처리를 사용하는 구문을 이해할 수 있다.
        // 예외는 세부 예외부터(하위타입예외) 순차적으로 작성해야한다
        // 그렇지 않으면 그 아래 예외처리는 도달할 수 없어 unreachable code 에러

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat"));
            String s;

            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생");
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            System.out.println("finally 실행");

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("없는 파일은 닫을 수 없습니다.");
                e.printStackTrace();
            }
        }
    }
}
