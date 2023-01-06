package org.example.inflearn;

public class Q0601 {
    public String solution(int n, int[] arr) {

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[minIndex]> arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
