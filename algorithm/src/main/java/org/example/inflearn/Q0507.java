package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0507 {
    public String solution(String s1, String s2) {
        Queue<Character> stack = new LinkedList<>();

        for (Character c : s1.toCharArray()) {
            stack.add(c);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (stack.size() == 0) return "YES";

            if (s2.charAt(i) == stack.peek()) {
                stack.poll();
            }

        }
        return stack.size() == 0 ? "YES" : "NO";
    }

}
