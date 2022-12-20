package org.example.inflearn;


public class Q0301 {
    //투포인터 방식
    //todo
    public int[] solution(int n, int m, int[] arr, int[] arr2) {
        int[] newArr = new int[n + m];
        int p1 = 0, p2 = 0, index = 0;

        while (p1 < n && p2 < m) {
            if (arr[p1] < arr2[p2]) {
                newArr[index++] = arr[p1++];
            } else {
                newArr[index++] = arr2[p2++];
            }
        }
        while (p1 < n) newArr[index++] = arr[p1++];
        while (p2 < m) newArr[index++] = arr2[p2++];

        return newArr;
    }
}
