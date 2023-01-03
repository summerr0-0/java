package org.example.inflearn;


import java.util.Stack;

public class Q0501 {
    public String solution(String s) {
        if (s.length() % 2 == 1) return "NO";

        Stack<Character> stack = new Stack<>();


        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);

            if (c == ')') {
                if (stack.size() == 0) return "NO";
                stack.pop();
            }
        }


        if (stack.size() > 1) return "NO";
        return "YES";
    }


}
