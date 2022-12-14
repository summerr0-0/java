package org.example.inflearn;

public class Q0108 {
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


    public String solution2(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }

}

