package org.example.inflearn;

public class Q0712 {
    int[] visit;
    int n, answer = 0;
    int[][] graph;

    public int solution(int N, int arr[][]) {
        n = N;
        visit = new int[N + 1];
        graph = arr;
        visit[1] = 1;
        dfs(1);
        return answer;
    }

    private void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && visit[i] == 0) {
                    visit[i] = 1;
                    dfs(i);
                    visit[i] = 0;
                }

            }
        }
    }

}
