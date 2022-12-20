package org.example.inflearn;

//todo 다시풀기
//https://cote.inflearn.com/contest/10/problem/02-12
public class Q0212 {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        //멘토멘티 케이스
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                //테스트
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    //학생등수
                    for (int s = 0; s < n; s++) {
                        //k테스트의 s등이 i학생일때
                        //현재 i학생은 s등이다
                        if (arr[k][s] == i) pi = s;

                        //k테스트의 s등이 j학생일때
                        //현재 j 학생은 s등이다
                        if (arr[k][s] == j) pj = s;
                    }
                    //i보다 j의 등수가 높아야 한다.
                    if (pi < pj) count++;
                }
                //멘토멘티 짝꿍이 되려면 모든 테스트가 pi<pj여야 한다.
                if (count == m) {
                    answer++;
                }
            }

        }
        return answer;
    }

}
