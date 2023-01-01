package org.example.codingtest.ch4.ct403;

//깊이의 리스트:
//이진 트리가 주어졌을 때 같은 깊이에 있는 노드를 연결리스트로 연결해 주는 알고리즘을 설계하라.
// 즉, 트리의 깊이가 D라면 D개의 연결리스트를 만들어야 한다.


import java.util.ArrayList;
import java.util.LinkedList;

public class Ct403_V2 {
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
     * 깊이 우선 탐색 기법을 사용 (전위순회)
     * 재귀함수를 호출할 때 Level +1 을 인자로 남김
     */
    public void createLevelLinkedList(Node root, ArrayList<LinkedList<Node>> lists, int level) {
        //초기
        if (root == null) return;

        LinkedList<Node> list = null;
        if (lists.size() == level) {
            list = new LinkedList<>();
            //깊이가 증가하는 순서로 순회함
            //깊이 i를 처음으로 마주쳤다면 0부터 i-1번째까지는 이번에 이미 Lists에 추가됨
            //따라서 새로운 깊이 i를 lists의 끝에 추가해도 된다.
            lists.add(list);
        } else list = lists.get(level);

        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }

    ArrayList<LinkedList<Node>> solution(Node root) {
        ArrayList<LinkedList<Node>> lists = new ArrayList<>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

}
