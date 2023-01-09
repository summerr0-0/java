package org.example.inflearn;

import java.util.Arrays;

public class Q0608 {
    public int solution(int M, int N, int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i : arr) {
            result++;
            if (i == N) break;
        }
        return result;
    }
}
