package org.example.codingtest.ch1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ct102 {
//    순열 확인: 문자열 두 개가 주어졌을 때
//    이 둘이 서로 순열 관계에 있는지 확 인하는 메서드를 작성하라
    public boolean solution(String s, String s2) {
        if (s.length() != s2.length()) return false;
        String ss = stringOrder(s);
        String ss2 = stringOrder(s2);
        return ss.equals(ss2);
    }

    private String stringOrder(String s) {
        List<String> strings = Arrays.asList(s.split(""));
        strings.sort(Comparator.naturalOrder());
        return strings.stream().map(String::valueOf).collect(Collectors.joining());
    }
}