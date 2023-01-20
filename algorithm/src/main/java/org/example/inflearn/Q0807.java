package org.example.inflearn;

public class Q0807 {
    int[][] arr;

    public int solution(int n, int r) {
        arr = new int[35][35];
        return DFS(n, r);

    }

    private int DFS(int n, int r) {
        if (arr[n][r] > 0) return arr[n][r];
        if (r == 0 || n == r) return 1;
        return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }


}
