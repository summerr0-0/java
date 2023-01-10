package org.example.inflearn;

import java.util.Arrays;

//재귀를 이용해 자연수 N이 입력되면 1~N까지 출력하기
public class Q0701 {
    public void solution(int N) {
        recursionFunc(1,N);
    }
    private void recursionFunc(int start,int N){
        System.out.println(start);
        if(start == N) return;
        recursionFunc(start+1,N);
    }

}
