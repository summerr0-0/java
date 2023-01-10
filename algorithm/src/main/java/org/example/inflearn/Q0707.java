package org.example.inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class Q0707 {
    Node root;

    static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node current = queue.poll();
                System.out.print(current.data+ " ");
                if(current.lt != null) queue.add(current.lt);
                if(current.rt != null) queue.add(current.rt);
            }
            L++;
            System.out.println();

        }

    }

}
