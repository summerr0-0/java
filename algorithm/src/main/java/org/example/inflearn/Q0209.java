package org.example.inflearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q0209 {
    public int solution(int[][] arr) {
        return Math.max(calWidth(arr),calDiagonal(arr));
    }

    private int calWidth(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int sum2 = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, Math.max(sum, sum2));
        }
        return max;
    }

    private int calDiagonal(int[][] arr) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum2 += arr[arr.length - 1 - i][i];
        }
        return Math.max(sum, sum2);
    }

}
