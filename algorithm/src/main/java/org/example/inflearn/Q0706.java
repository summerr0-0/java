package org.example.inflearn;

public class Q0706 {
    int n;
    int[] ch;

    public void solution(int N) {
        n = N;
        ch = new int[n + 1];
        DFS(1);
    }

    private void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
            return;
        }
        ch[L] = 1;
        DFS(L + 1);
        ch[L] = 0;
        DFS(L + 1);
    }

}
