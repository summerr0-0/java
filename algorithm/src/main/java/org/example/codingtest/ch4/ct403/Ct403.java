package org.example.codingtest.ch4.ct403;

//깊이의 리스트:
//이진 트리가 주어졌을 때 같은 깊이에 있는 노드를 연결리스트로 연결해 주는 알고리즘을 설계하라.
// 즉, 트리의 깊이가 D라면 D개의 연결리스트를 만들어야 한다.


import java.util.ArrayList;
import java.util.LinkedList;

public class Ct403 {
    static class Node {
        private Node left;
        private Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public void addRight(Node node) {
            this.right = right;
        }

        public void addLeft(Node node) {
            this.left = left;
        }
    }

    /**
     * 루트를 먼저 방문하고 두번째 깊이에 해당하는 노드,세 번째 깊이에 해당하는 노드를 차례로 방문
     * i번째 깊이에 도달할땐 i-1 번째 깊이에 해당하는 노드들은 전부 방문
     * => i번째 깊이에 어떤 노드들이 있는지 알아내려면
     * i-1번째 깊이에 있는 노드를 검사
     *
     */
    public ArrayList<LinkedList<Node>> createLevelLinkedList(Node root) {
        ArrayList<LinkedList<Node>> result = new ArrayList<>();

        //루드 방문
        LinkedList<Node> current = new LinkedList<>();

        if (root != null) current.add(root);

        while (current.size() > 0) {
            result.add(current); //이전 깊이 추가
            LinkedList<Node> parents = current; //다음 깊이로 진행
            current = new LinkedList<>();
            for (Node parent : parents) {
                //자식 노드 방문
                if (parent.left != null) current.add(parent.left);
                if (parent.right != null) current.add(parent.right);

            }
        }
        return result;
    }

}
