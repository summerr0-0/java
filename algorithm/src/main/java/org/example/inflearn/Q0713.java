package org.example.inflearn;

import java.util.List;

public class Q0713 {
    List<List<Integer>> graph;
    int[] visit;
    int count = 0;
    int N;

    public int solution(int n, List<List<Integer>> list) {
        N = n;
        visit = new int[n + 1];
        graph = list;
        visit[1] = 1;
        dfs(1);
        return count;
    }

    private void dfs(int d) {
        if (d == N) count++;
        else {
            for (int nv : graph.get(d)) {
                if (visit[nv] == 0) {
                    visit[nv] = 1;
                    dfs(nv);
                    visit[nv] = 0;
                }
            }
        }
    }


}
