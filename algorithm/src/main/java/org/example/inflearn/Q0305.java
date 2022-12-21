package org.example.inflearn;

public class Q0305 {
    public int solution(int n) {
        int lt = 1, count = 0, sum = 1;
        for (int rt = 2; rt < n; rt++) {
            sum += rt ;
            if (sum == n) count++;
            while (sum >= n) {
                sum = sum-(lt++);
                if (sum == n) count++;
            }
        }
        return count;
    }
}
