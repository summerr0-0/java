package org.example.inflearn;

import java.util.Stack;

public class Q0505 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (s.charAt(i - 1) == '(') count += stack.size();
                else count++;
            }
        }


        return count;
    }
}
