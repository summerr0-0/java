package org.example;


public class Main {
    int[] visit;
    int n, answer = 0;
    int[][] graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }

        Main main = new Main();

        System.out.println(main.solution(N,arr));

    }

    //방향그래프의 모든 경로의 가지 수
    public int solution(int N, int arr[][]) {
        n = N;
        visit = new int[N + 1];
        graph = arr;
        dfs(1);
        return answer;
    }

    private void dfs(int v) {
        //정점에 다달으면 count 증가
        if (v == n) answer++;
            //방문 안햇고 연결점잉 ㅣㅆ으면
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && visit[i] == 0) {
                    visit[i] = 1;
                    dfs(i);
                    visit[i] = 0;
                }

            }
        }
    }
}


