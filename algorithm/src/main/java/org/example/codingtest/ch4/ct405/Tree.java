package org.example.codingtest.ch4.ct405;

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
            left = null;
            right = null;
        }

        private void putLeft(Node node) {
            this.left = node;
            count++;
        }
        private void putRight(Node node) {
            this.right = node;
            count++;
        }

        private void delLeft(){
            this.left = null;
            count--;
        }

        private void delRight(){
            this.right = null;
            count--;
        }
    }

    public Node createNode(int data){
        return new Node(data);
    }

    public void putLeft(Node node){
        node.delLeft();
    }

    public void putRight(Node node){
        node.delRight();
    }

}
