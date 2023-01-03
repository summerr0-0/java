package org.example.inflearn;


import java.util.Stack;
import java.util.stream.Collectors;

public class Q0503 {
    public int solution(int N, int[][] board, int M, int[] moves) {
        int count = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int index = moves[i] - 1;

                int value = board[j][index];

                if (value == 0) continue;

                if (stack.size() > 0 && stack.peek() == value) {
                    stack.pop();
                    count+=2;
                } else {
                    stack.push(value);
                }

                board[j][index] = 0;
                break;
            }
        }
        return count;
    }

}
