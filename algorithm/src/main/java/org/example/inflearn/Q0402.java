package org.example.inflearn;

import java.util.HashMap;
import java.util.Map;

public class Q0402 {
    public String solution(String s1, String s2) {
        if (s1.length() != s2.length()) return "NO";
        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
            s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (s1map.size() != s2map.size()) return "NO";

        for (char i : s1map.keySet()){
            int s1count = s1map.get(i);
            int s2count = s2map.get(i);
            if(s1count != s2count) return "NO";
        }
        return "YES";

    }
}
