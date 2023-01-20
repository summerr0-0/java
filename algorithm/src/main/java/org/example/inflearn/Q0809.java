package org.example.inflearn;

public class Q0809 {
    int[] result;
    int n;

    int m;

    public void solution(int n, int m) {
        result = new int[m];
        this.n = n;
        this.m = m;
        dfs(0, 1);
    }

    private void dfs(int l, int s) {
        if (l == m) {
            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                result[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }

}
