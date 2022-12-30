package org.example.codingtest.ch4;

//깊이의 리스트:
//이진 트리가 주어졌을 때 같은 깊이에 있는 노드를 연결리스트로 연결해 주는 알고리즘을 설계하라.
// 즉, 트리의 깊이가 D라면 D개의 연결리스트를 만들어야 한다.


import com.sun.source.tree.Tree;
import org.example.codingtest.ch2.Q1.LinkedList;

public class Q403 {
    int count;

    public Q403() {
        this.count = 0;
    }

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void addLeft(TreeNode node) {
            this.left = node;
            count++;
        }

        public void addRight(TreeNode node) {
            this.right = node;
            count++;
        }

        public void deleteLeft() {
            this.left = null;
            count--;
        }

        public void deleteRight() {
            this.right = null;
            count--;
        }
    }

    public TreeNode addNode(int data) {
        TreeNode n = new TreeNode(data);
        return n;
    }

    //전위
    public void preOrder(TreeNode node) {
        if (node == null) return;

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    //후위
    public void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    public void inOrder(TreeNode node){
        if(node == null) return;

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
}
