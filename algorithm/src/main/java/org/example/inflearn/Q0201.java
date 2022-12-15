package org.example.inflearn;

public class Q0201 {
    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sb.append(arr[i + 1]).append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

}
