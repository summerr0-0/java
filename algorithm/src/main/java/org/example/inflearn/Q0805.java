package org.example.inflearn;

import java.util.Arrays;
import java.util.Collections;

public class Q0805 {
    int minCoin;
    int n;
    int m;

    public int solution(int N, Integer[] arr, int M) {
        minCoin = Integer.MAX_VALUE;
        n = N;
        m = M;

        Arrays.sort(arr, Collections.reverseOrder());
        DFS(0, 0, arr);
        return minCoin;
    }

    private void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= minCoin) return;
        if (sum == m) {
            minCoin = Math.min(L, minCoin);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }


}
