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
        int level = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            System.out.println("==" + level + "==");
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.println(current.data);
                if (current.lt != null) queue.add(current.lt);
                if (current.rt != null) queue.add(current.rt);
            }
            level++;
        }
    }

}
