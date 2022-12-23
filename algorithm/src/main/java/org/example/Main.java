package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main main = new Main();
        int solution = main.solution(n, t, arr);
        System.out.println(solution);
    }

    public int solution(int n, int t, int[] arr) {
        int tcount = 0, max = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) tcount++;

            while (tcount > t) {
                if (arr[lt] == 0) tcount--;
                lt++;
            }

            max = Math.max(max, rt - lt + 1);
        }
        return max;
    }
}