package org.example;

public class Q0109 {
    public String solution(String input) {
        String str = input.toLowerCase();
        String s = str.replaceAll("[^a-zA-Z]", "");

        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                return "NO";
            }
        }
        return "YES";

    }
}
