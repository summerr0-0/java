package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = input.toLowerCase();
        String s = str.replaceAll("[^a-zA-Z]", "");

        String result = "YES";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                result =  "NO";
                break;
            }
        }
        System.out.println(result);
    }
}