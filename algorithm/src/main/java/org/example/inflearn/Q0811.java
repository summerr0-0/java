package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0811 {
    //bfs 사용
    public int solution(int[][] map) {
        return bfs(map);
    }

    private int bfs(int[][] map) {
        int[] yMove = {1, 0, -1, 0};
        int[] xMove = {0, 1, 0, -1};
        int[][] distance = new int[7][7];
        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(0, 0));

        while (queue.size() > 0) {

            Point now = queue.poll();

            int nowX = now.x;
            int nowY = now.y;

            for (int i = 0; i < 4; i++) {
                int mx = nowX + xMove[i];
                int my = nowY + yMove[i];
                if (mx < 0 || mx > 6 || my < 0 || my > 6 || map[my][mx] == 1) continue;

                queue.add(new Point(mx, my));
                map[my][mx] = 1;
                distance[my][mx] = distance[nowY][nowX] + 1;
            }

        }
        if (distance[6][6] == 0) return -1;
        return distance[6][6];
    }


    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

}
