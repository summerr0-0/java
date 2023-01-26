package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0812 {
    public int solution(int M, int N, int[][] arr) {
        boolean flag = true;

        int[] mx = {1, 0, -1, 0};
        int[] my = {0, 1, 0, -1};

        Queue<Point> queue = new LinkedList<>();
        //초기세팅
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1) {
                    queue.add(new Point(j, i));
                }
            }
        }

        while (queue.size() > 0) {
            Point p = queue.poll();
            int x = p.x;
            int y = p.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + mx[i];
                int ny = y + my[i];


                if (nx < 0 || ny < 0 || nx >= M || ny >= N || arr[ny][nx] >=1 || arr[ny][nx] == -1) continue;

                arr[ny][nx] = arr[y][x]+1;
                queue.add(new Point(nx, ny));
            }

        }


        int max = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) return -1;
                max = Math.max(max, arr[i][j]);
            }
        }
        return max-1;
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
