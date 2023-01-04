package org.example.inflearn;

import java.util.Stack;

public class Q0504 {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '+' -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 + num1);
                    break;
                }
                case '-' -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                }
                case '*' -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 * num1);
                    break;
                }
                case '/' -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                }
                default -> stack.push(Character.getNumericValue(c));
            }

        }
        return stack.pop();
    }
}
