package org.example.inflearn;

import java.util.Arrays;

public class Q0609 {
    public int solution(int N, int M, int[] arr) {
        int answer = 0;
        int start = arr[N - 1];
        int end = Arrays.stream(arr).sum();

        while (start <= end) {
            int mid = (start + end)/2;

            if(count(arr,mid)<=M){
                answer = mid;
                end = mid-1;
            }else start = mid+1;
        }
        return answer;
    }
    private int count(int[] arr, int mid){
       int cnt = 1, sum = 0;
       for(int x : arr){
           if(sum+x > mid){
               cnt ++ ;
               sum = x;
           }
           else sum+=x;
       }
       return cnt;
    }
}
