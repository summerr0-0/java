package org.example.inflearn;

//sliding window
//todo
public class Q0303 {
    public int solution(int n, int m, int[] arr) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        int result = sum;
        for (int i = m; i < n; i++) {
            result+=arr[i];
            result-=arr[i-m];
            sum = Math.max(result,sum);
        }
        return sum;
    }
}
