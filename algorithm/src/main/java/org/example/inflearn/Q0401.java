package org.example.inflearn;

import java.util.HashMap;
import java.util.Map;

public class Q0401 {
    public String solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int max = Integer.MIN_VALUE;
        char leader = 0;
        for(char i:map.keySet()){
            if(map.get(i)>max){
                leader = i;
                max = map.get(i);
            }
        }
        return String.valueOf(leader);
    }
}
