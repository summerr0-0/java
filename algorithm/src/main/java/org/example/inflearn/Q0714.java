package org.example.inflearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q0714 {

    public void solution(List<List<Integer>> list) {
        int[] result = DFS(list);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private int[] DFS(List<List<Integer>> list) {
        Queue<Integer> queue = new LinkedList<>();
        int[] count = new int[list.size() + 1];
        int[] visit = new int[list.size() + 1];
        visit[1] = 1;
        count[1] = 0;

        queue.add(1);

        while (queue.size()>0){
            int cv = queue.poll();
            for(int nv : list.get(cv)){
                if(visit[nv] == 0){
                    visit[nv] = 1;
                    queue.add(nv);
                    count[nv] = count[cv]+1;
                }
            }
        }
        return count;
    }

}
