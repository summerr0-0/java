package org.example.inflearn;

import javax.swing.*;

public class Q0808 {
    int n;
    int f;
    int[] ch;
    int[] b;
    int[] p;
    int[][] dy;

    boolean flag;

    public void solution(int n, int f){
        flag = false;
        this.f = f;
        this.n = n;
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        dy = new int[35][35];
        for(int i = 0; i<n; i++){
            b[i] = combi(n-1,i);
        }

        dfs(0,0);
    }

    private int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    private void dfs(int L, int sum) {
        if(flag) return;
        if (L == n) {
            if(sum==f){
                for(int x : p) System.out.println(x+" ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    dfs(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

}
