package org.example.tree;

//이진 트리
public class BinaryTree {
    int count;

    public BinaryTree() {
        count = 0;
    }

    public class Node {
        private Node left;
        private Node right;
        private int data;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        //왼쪽 노드에 추가
        public void addLeft(Node node) {
            left = node;
            count++;
        }

        //오른쪽 노드에 추가
        public void addRight(Node node) {
            right = node;
            count++;
        }

        //왼쪽 노드 삭제
        public void deleteLeft(Node node) {
            left = null;
            count--;
        }

        //오른쪽 노트 삭제
        public void deleteRight(Node node) {
            right = null;
            count--;

        }

    }

    public Node addNode(int data) {
        Node n = new Node(data);
        return n;
    }

    //전위
    //자식노드보다 현재노드를 먼저 방문하는 방법
    public void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //중위
    //왼쪽가지, 현재노드, 오른쪽가지 순서로 방문하고 출력
    public void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }

    //후위
    //모든 자식 노드들을 먼저 방문한 뒤 마지막에 현재 노드를 방문
    public void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data + " ");
    }


}
