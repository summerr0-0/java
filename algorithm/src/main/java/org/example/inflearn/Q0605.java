package org.example.inflearn;

import java.util.HashSet;
import java.util.Set;

public class Q0605 {
    public String solution(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        if(arr.length != set.size()) return "D";
        return "U";

    }
}
