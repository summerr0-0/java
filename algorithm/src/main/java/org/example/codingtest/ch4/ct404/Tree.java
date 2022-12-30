package org.example.codingtest.ch4.ct404;

public class Tree {
    int count;

    public Tree() {
        this.count = 0;
    }

    public class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        private void addLeft(Node node) {
            this.left = node;
            count++;
        }

        private void addRight(Node node) {
            this.right = node;
            count++;
        }

        private void deleteLeft() {
            this.left = null;
            count--;
        }

        private void deleteRight() {
            this.right = null;
            count--;
        }

    }

    public Node createNode(int data) {
        Node n = new Node(data);
        return n;
    }

}
