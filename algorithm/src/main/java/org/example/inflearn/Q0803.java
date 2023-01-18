package org.example.inflearn;

import java.util.Arrays;

public class Q0803 {
    int max = 0;
    int n;
    int c;

    public int solution(int N, int C, int[][] arr) {
        max = Integer.MIN_VALUE;
        n = N;
        c = C;
        dfs(0, 0, 0, arr);
        return max;
    }


    private void dfs(int tSum, int sSum, int deptn, int[][] arr) {
        if (tSum > c) return;
        if (deptn == n) {
            max = Math.max(sSum, max);
        } else {
            dfs(tSum + arr[deptn][1], sSum + arr[deptn][0], deptn + 1, arr);
            dfs(tSum, sSum, deptn + 1, arr);
        }


    }

}
