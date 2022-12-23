package org.example.codingtest.ch1;


import java.util.Locale;

public class Ct104 {
    public boolean solution(String s) {
        s = s.replaceAll(" ","");
        s = s.toLowerCase(Locale.ROOT);
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                boolean sameWord = false;
                for (int j = 0; j < s.length(); j++) {
                    if (i == j) continue;
                    if (s.charAt(i) == s.charAt(j)) sameWord = true;
                }
                if (!sameWord) return false;
            }
        } else {
            int diffCount = 0;
            for (int i = 0; i < s.length(); i++) {
                boolean sameWord = false;
                for (int j = 0; j < s.length(); j++) {
                    if (i == j) continue;
                    if (s.charAt(i) == s.charAt(j)) sameWord = true;
                }
                if (!sameWord) {
                    diffCount++;
                    if (diffCount > 1) return false;
                }
            }
        }
        return true;
    }
}