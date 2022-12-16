package org.example.inflearn;

//todo 다시 풀기
//https://cote.inflearn.com/contest/10/problem/02-11
public class Q0211 {
    public int solution(int[][] arr) {
        int n = arr.length;
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer + 1;
    }

}
