package org.example.inflearn;

import java.util.*;

public class Q0405 {
    public int solution(int N, int K, int[] arr) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        //세장뽑기
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {

                    set.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int count = 0;
        for(int i: set){
            count++;
            if(count==K) return i;
        }
        return -1;
    }
}
