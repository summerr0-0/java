package org.example.inflearn;

public class Q0709 {
    int min = Integer.MAX_VALUE;
    Node root;

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }

    public int solution(Node node) {
        return DFS(node, 0);
    }

    private int DFS(Node node, int count) {
        if (node.lt == null && node.rt == null) return count;
        return Math.min(DFS(node.lt, count + 1), DFS(node.rt, count + 1));
    }

}
