package org.example.inflearn;

import java.util.Arrays;

//이분검색으로 찾기
public class Q0608 {
    public int solution(int M, int N, int[] arr) {
        Arrays.sort(arr);

        int start = 0;
        int end = M;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == N) return mid + 1;
            if (arr[mid] > N) end = mid - 1;
            if (arr[mid] < N) start = mid + 1;

        }

        return -1;
    }
}
