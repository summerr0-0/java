package org.example.inflearn;


import java.util.*;
import java.util.stream.Collectors;

public class Q0502 {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                char next = stack.pop();
                while (next != '(') {
                    next = stack.pop();
                }
            } else stack.push(c);
        }

        return stack.stream()
            .map(Object::toString)
            .collect(Collectors.joining());
    }


}
