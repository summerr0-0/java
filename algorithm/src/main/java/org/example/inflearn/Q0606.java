package org.example.inflearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q0606 {
    public String solution(int N, int[] arr) {

        int c = -1;
        int f = -1;

        int[] actualArr = new int[N];

        System.arraycopy(arr, 0, actualArr, 0, N);
        Arrays.sort(actualArr);

        for (int i = 0; i < N; i++) {
            if (c == -1 && arr[i] != actualArr[i]) {
                c = i+1;
            }
            if (c >= -1 && arr[i] != actualArr[i]) {
                f = i+1;
            }

        }
        return c + " " + f;
    }
}
