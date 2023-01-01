package org.example.codingtest.ch4.ct406;

/**
 * 후속자
 * 이진 탐색 트리 에서 주어진 노드의 ‘다음’ 노드(중위 후속자(in-order successor))
 * 를 찾는 알고리즘을 작성하라.
 * 각 노드에는 부모 노드를 가리키는 링크가 존재한다고 가정하자
 */
public class Ct406 {
    static class Node {
        int data;
        Node parent;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node getNextInOrder(Node node) {
        if (node == null) return node;

        //오른쪽 탐색
        if (node.right != null) return leftMostChild(node.right);

        Node q = node;
        Node x = q.parent;

        //왼쪽에 있을 때까지 위로 올라간다
        while (x != null && x.left != q) {
            q = x;
            x = x.parent;
        }
        return x;

    }

    //맨 끝까지 탐색
    private Node leftMostChild(Node node) {
        if (node == null) return null;
        while (node.left != null)
            node = node.left;
        return node;
    }
}
