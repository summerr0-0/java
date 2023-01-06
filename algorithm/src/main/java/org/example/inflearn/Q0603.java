package org.example.inflearn;

public class Q0603 {
    public String solution(int n, int[] arr) {

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
