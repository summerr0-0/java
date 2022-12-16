package org.example.inflearn;

public class Q0207 {
    public int solution(int[] arr) {
        int point = 1;
        int totalPoint = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                totalPoint += point;
                point++;
            } else {
                point = 1;
            }
        }
        return totalPoint;
    }
}
