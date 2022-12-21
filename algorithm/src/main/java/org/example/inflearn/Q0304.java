package org.example.inflearn;


//todo
public class Q0304 {
    public int solution(int n, int m, int[] arr) {
        int lt = 0, count = 0, sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) count++;
            while (sum>=n){
                sum-=arr[lt++];
                if(sum==m) count++;
            }
        }
        return count;
    }
}

