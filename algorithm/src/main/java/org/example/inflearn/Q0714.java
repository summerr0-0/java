package org.example.inflearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q0714 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void solution(int N) {

    }

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.add(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.add(nv);
                    dis[nv] = dis[cv + 1];
                }
            }

        }
    }

}
