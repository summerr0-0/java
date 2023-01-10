package org.example.inflearn;

//재귀를 이용해 10진수 N이 입력되면 2진수로 변환해 출력
public class Q0702 {
    public void solution(int N) {
        binary(N,0);
    }

    private void binary(int v,int remainder){

        if(v == 0) return;
        binary(v/2,v%2);
        System.out.println(v%2);

    }

}
