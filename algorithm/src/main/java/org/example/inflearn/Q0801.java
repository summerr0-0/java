package org.example.inflearn;

import java.util.*;

public class Q0801 {
    boolean flag;

    int total;

    public String solution(int[] arr) {
        Arrays.sort(arr);
        total = Arrays.stream(arr).sum();
        flag = false;
        dfs(0, 0, arr);
        return flag ? "YES" : "NO";
    }

    private void dfs(int depth, int sum, int[] graph) {
        if (flag) return;
        if (sum > total / 2) return;
        if (depth == graph.length) {
            if (total - sum == sum) flag = true;
        } else {
            dfs(depth + 1, sum + graph[depth], graph);
            dfs(depth + 1, sum, graph);
        }
    }


}
