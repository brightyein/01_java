package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {
    public static void main(String[] args) {

        // try 문에 직접 BufferedReader 를 넣으면 마지막에 close 를 하지 않아도 자동으로 닫아줌

        try(BufferedReader in = new BufferedReader(new FileReader("test.dat"))){
            String s;
            while((s = in.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
