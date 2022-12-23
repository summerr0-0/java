package org.example.codingtest.ch1;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

//중복이 없는가: 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어
//    등장하는지 확인하는 알고리즘을 작성하라. 자료구조를 추가로 사용하지
//    않고 풀 수 있는 알고리즘 또한 고민하라.
public class Ct101 {
    public boolean solution(String s) {
        Set<String> set = new HashSet<>(List.of(s.split("")));
        return set.size() == s.length();
    }

    //자료구조 사용 안함
    public boolean solution2(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j) continue;
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}