package org.example;

import java.util.Scanner;

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

//    public int solution(String s) {
//        //int answer=0;
//        String answer = "";
//        for (char x : s.toCharArray()) {
//            //if(x>=48 && x<=57) answer=answer*10+(x-48);
//			/*if(Character.isDigit(x)){
//				answer=answer*10+ Character.getNumericValue(x);
//			}*/
//            if (Character.isDigit(x)) answer += x;
//        }
//        return Integer.parseInt(answer);
//
//    }
}
