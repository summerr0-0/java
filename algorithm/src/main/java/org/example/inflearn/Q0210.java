package org.example.inflearn;

public class Q0210 {
    public int solution(int[][] arr) {
        int[][] move = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        int peak = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                boolean isPeak = true;

                for (int k = 0; k < move.length; k++) {
                    int mi = i + move[k][0];
                    int mj = j + move[k][1];

                    if (arr[i][j] <= arr[mi][mj]) {
                        isPeak = false;
                        break;
                    }

                }
                if (isPeak) {
                    peak++;
                    System.out.println("peak is" + arr[i][j]);
                }
            }

        }
        return peak;
    }


}
