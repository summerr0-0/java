package org.example.inflearn;

import java.util.Arrays;

public class Q0804 {
    int[] arr;
    int n, m;

    public void solution(int N, int M) {
        n = N;
        m = M;
        arr = new int[M];
        DFS(0);
    }

    private void DFS(int depth) {
        if (depth == m) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                arr[depth] = i;
                DFS(depth + 1);
            }
        }
    }

}
