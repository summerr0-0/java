package org.example.inflearn;

public class Q0810 {
    int[][] visit = new int[7][7];
    int[] xmove = new int[]{1, 0, -1, 0};
    int[] ymove = new int[]{0, 1, 0, -1};
    int count = 0;


    public int solution(int[][] map) {
        visit[0][0] = 1;
        dfs( map, 0, 0);
        return count;
    }

    private void dfs(int[][] map, int x, int y) {

        if (x == 6 && y == 6) count++;


        for (int i = 0; i < 4; i++) {
            int nx = x + xmove[i];
            int ny = y + ymove[i];

            if (nx < 0 || nx >= 7 || ny < 0 || ny >= 7) continue;
            if (visit[ny][nx] == 1 || map[ny][nx] == 1) continue;

            visit[ny][nx] = 1;
            dfs(map, nx, ny);
            visit[ny][nx] = 0;

        }

    }

}
