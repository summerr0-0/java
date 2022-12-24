package org.example.inflearn;

import java.util.HashMap;
import java.util.Map;

public class Q0403 {
    public String solution(int N, int K, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Map<Integer,Integer> map = new HashMap();

        for (int i = 0; i < K; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        sb.append(map.size()).append(" ");
        int lt = 0;
        for(int rt = K; rt<N; rt++){
            //map에 값 더하기
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);

            //map에 값 빼기
            int value = map.get(arr[lt]);
            if(value==1) map.remove(arr[lt]);
            else map.put(arr[lt], value-1);

            lt++;
            sb.append(map.size()).append(" ");

        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
