package main.java.com.ohgiraffers.section02.set.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackQuestion {
    public static void main(String[] args) throws IOException {

        /* 백준 10773 stack 의 push 와 pop 활용 문제 */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 숫자들을 넣을 스택 만들기
        Stack<Integer> stack = new Stack<>();

        int result = 0;

        // 0이 아니면 넣고 0이면 최근껄 뺀다
        for (int i = 0; i < N; i++) {

            int num = sc.nextInt();

            if (num != 0) {
                stack.push(num);
            } else if (num == 0) stack.pop();
        }

        System.out.println(stack);

        for (Integer i : stack) {
            result += i;
        }
        System.out.println(result);
    }
}
