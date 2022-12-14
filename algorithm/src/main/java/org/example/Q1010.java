package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1010 {
    public String solution(String s, String t) {
        int end = s.length();

        List<Integer> tIndexs = new ArrayList<>();
        int[] distance = new int[end];
        Arrays.fill(distance, 999);

        //index들
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == t.charAt(0)) tIndexs.add(i);
        }


        for (int i = 0; i < tIndexs.size(); i++) {
            for (int j = 0; j < distance.length; j++) {
                if (distance[j] > Math.abs(j - tIndexs.get(i))) {
                    distance[j] = Math.abs(j - tIndexs.get(i));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : distance) {
            sb.append(i).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
