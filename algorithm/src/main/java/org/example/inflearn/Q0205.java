package org.example.inflearn;

//todo 다시풀어보기
public class Q0205 {
    public int solution(int n) {
        int[] arr = new int[n + 1];
        int count = 0;
        for (int i = 2; i <=n; i++) {
            if (arr[i] == 0) {
                count++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
    return count;
    }


}
