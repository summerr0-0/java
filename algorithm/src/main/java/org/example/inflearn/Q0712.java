package org.example.inflearn;

public class Q0712 {
    int[][] graph;
    int[] visit;
    int count = 0;
    int N;

    public int solution(int n, int[][] arr) {
        N = n;
        visit = new int[arr.length + 1];
        graph = arr;
        visit[1] = 1;
        dfs(1);
        return count;
    }

    private void dfs(int d) {
        if (d == N) count++;
        else {
            for (int i = 1; i < graph.length; i++) {
                if (visit[i] == 0 && graph[d][i] == 1) {
                    visit[i] = 1;
                    dfs(i);
                    visit[i] = 0;
                }
            }
        }
    }


}
