package org.example.inflearn;

public class Q0206 {
    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            int reverseNum = reverse(num);
            if (isMinority(reverseNum)) {
                sb.append(reverseNum).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private int reverse(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(s.reverse().toString());
    }

    private boolean isMinority(int num) {
        if (num == 1) return false;
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
                if (count > 1) return false;
            }
        }
        return true;
    }

}
