package org.example.inflearn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//투포인터 방식
//todo
public class Q0302 {
    public List<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr[p1] == arr2[p2]) {
                list.add(arr[p1++]);
                p2++;
            } else if (arr[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return list;

    }
}
