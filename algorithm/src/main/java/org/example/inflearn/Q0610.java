package org.example.inflearn;

import java.util.Arrays;

public class Q0610 {
    public int solution(int N, int M, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[N - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(mid, arr) < M) {
                rt = mid - 1;
                continue;
            }
            lt = mid + 1;
            answer = mid;
        }

        return answer;
    }

    private int count(int mid, int[] arr) {
        int count = 1;
        int distinct = 0;

        for (int i = 1; i < arr.length; i++) {
            distinct += arr[i] - arr[i - 1];
            if (distinct >= mid) {
                count++;
                distinct = 0;
            }
        }
        return count;
    }

}
