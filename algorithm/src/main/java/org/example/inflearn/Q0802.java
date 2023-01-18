package org.example.inflearn;

public class Q0802 {
    int weight;
    int max;

    public int solution(int C, int[] arr) {
        weight = Integer.MIN_VALUE;
        max = C;
        dfs(0, 0, arr);
        return weight;
    }

    private void dfs(int depth, int sum, int[] graph) {
        if (max < sum) return;
        if (graph.length == depth) {
            weight = Math.max(weight, sum);
        } else {
            dfs(depth + 1, sum + graph[depth], graph);
            dfs(depth + 1, sum, graph);
        }
    }


}
