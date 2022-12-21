package org.example.inflearn;

//todo
public class Q0306 {
    public int solution(int n, int t, int[] arr) {
        int max = 0,  tcount = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) tcount++;

            while (tcount > t) {
                if (arr[lt] == 0) tcount--;
                lt++;
            }

            max = Math.max(max, rt - lt + 1);

        }

        return max;
    }
}
