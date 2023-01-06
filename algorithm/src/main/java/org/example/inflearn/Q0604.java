package org.example.inflearn;

import java.util.ArrayList;
import java.util.List;

public class Q0604 {
    public String solution(int S, int N, int[] arr) {

        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(list.contains(i)){
                list.remove((Integer)i);
                list.add(i);
                continue;
            }
            if(list.size() == S){
                list.remove(0);
                list.add(i);
                continue;
            }
            list.add(i);

        }

        StringBuilder sb = new StringBuilder();
        for(int i = list.size()-1; i>=0; i--){
            sb.append(list.get(i)).append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }


}
