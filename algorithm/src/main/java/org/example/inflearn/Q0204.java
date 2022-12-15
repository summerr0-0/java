package org.example.inflearn;

public class Q0204 {
    public String solution(int size) {
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int num :
            arr) {
            sb.append(num).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();

    }


}
