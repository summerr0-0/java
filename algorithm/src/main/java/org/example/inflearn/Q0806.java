package org.example.inflearn;

import java.util.Arrays;
import java.util.Collections;

public class Q0806 {
    int[] visit;
    int[] sequence;
    int m;

    public void solution(int N, int M, int[] arr) {
        visit = new int[N];
        sequence = new int[M];
        m = M;
        DFS(arr, 0);

    }

    private void DFS(int[] arr, int depth) {

        if (depth == m) {
            for (int n : sequence) {
                System.out.print(n + " ");
            }
            System.out.println();
        } else {

            for (int i = 0; i < arr.length; i++) {
                if (visit[i] == 1) continue;
                visit[i] = 1;
                sequence[depth] = arr[i];
                DFS(arr, depth + 1);
                visit[i] = 0;
            }
        }
    }


}
