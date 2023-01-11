package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0708 {
    public int solution(int S, int E) {

        return (BFS(S, E));
    }

    private int BFS(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[10001];
        int[] dis = {1,-1,5};
        queue.add(s);
        int jump = 0;
        while (queue.size() > 0) {
            int l = queue.size();
            for (int i = 0; i < l; i++) {
                int current = queue.poll();
                if(current == e) return jump;
                for(int j = 0; j< 3; j++){
                    int index = current+dis[j];
                    if(index >0 && index <=10000 && !visit[index]) queue.add(index);
                    visit[index] = true;
                }
            }
            jump++;
        }
        return jump;
    }



}
