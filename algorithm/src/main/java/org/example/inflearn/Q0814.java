package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0814 {
    //bfs
    int n;

    int[][] move = {
        {1, 0},
        {0, 1},
        {-1, 0},
        {0, -1},
        {-1, -1},
        {-1, 1},
        {1, 1},
        {1, -1}
    };

    public int solution(int N, int[][] arr) {
        int count = 0;
        n = N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    arr[i][j] = 0;
                    bfs(i, j, arr);
                }
            }
        }
        return count;
    }

    private void bfs(int x, int y, int[][] arr) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        while (queue.size() > 0) {
            Point point = queue.poll();
            x = point.x;
            y = point.y;
            for (int i = 0; i < 8; i++) {
                int nx = x + move[i][0];
                int ny = y + move[i][1];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] == 0) continue;
                queue.add(new Point(nx,ny));
                arr[nx][ny] = 0;

            }
        }
    }

    class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
