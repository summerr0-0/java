package org.example.codingtest.ch4;

import java.util.LinkedList;
import java.util.Queue;

//노드사이의경로
// 방향그래프가주어졌을때 두 노드사이에 경로가 존재 하는지 확인하는 알고리즘을 작성하라.
public class Ct401 {
    public boolean solution(int[][] arr, int start, int end) {
        boolean[] visit = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        //초기 값 세팅
        visit[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int i = 0; i < arr.length; i++) {
                if (arr[v][i] == end) return true;

                if (arr[v][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;

                }
            }

        }
        return false;
    }

}
