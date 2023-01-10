package org.example.inflearn;
//재귀를 이용해 팩토리얼 구하기
public class Q0703 {
    public int solution(int N) {
        return DFS(N);
    }
    private int DFS(int N){
        if(N==0) return 1;
        return N* DFS(N-1);
    }
}
