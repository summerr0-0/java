package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0710 {
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

        return BFS(node);
    }

    private int BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int l = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                if(currentNode.lt==null && currentNode.rt == null) return l;
                if(currentNode.lt!=null) queue.add(currentNode.lt);
                if(currentNode.rt!=null) queue.add(currentNode.rt);
            }
            l++;
        }
        return l;
    }
}
