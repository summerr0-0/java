package org.example.inflearn;

import java.util.List;

public class Q0713 {
    int[] visit;
    int n, answer = 0;
    List<List<Integer>> graph;

    public int solution(int N, List<List<Integer>> list) {
        n = N;
        visit = new int[N + 1];
        graph = list;
        visit[1] = 1;
        dfs(1);
        return answer;
    }

    private void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (visit[nv] == 0) {
                    visit[nv] = 1;
                    dfs(nv);
                    visit[nv] = 0;
                }
            }
        }
    }


}
