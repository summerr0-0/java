package org.example.inflearn;

public class Q0704 {
    int[] arr;

    public String solution(int N) {
        arr = new int[N];
        DFS(N);
        StringBuffer sb = new StringBuffer();
        for (int i :
            arr) {
            sb.append(i).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private int DFS(int N) {
        if (N == 1) return arr[N-1] = 1;
        if (N == 2) return arr[N-1] = 1;
        return arr[N-1] = DFS(N - 1) + DFS(N - 2);
    }
}
