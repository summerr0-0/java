package org.example.codingtest.ch2;
//중간 노드 삭제: 단방향 연결리스트가 주어졌을 때 중간(정확히 가운데 노드 일 필요는 없고
// 처음과 끝 노드만 아니면 된다)에 있는 노드 하나를 삭제하는 알고리즘을 구현하라.
// 단, 삭제할 노드에만 접근할 수 있다.

//중간 값 줄테니까 그 값을 삭제하는 알고리즘을 구하는 것
//헤드 사용 없이
public class Ct203 {
    Node head = null;

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }


    public void insertNode(Node data) {
        if (this.head == null) {
            this.head = data;
            return;
        }
        Node now = this.head;
        while (now.next != null) {
            now = now.next;
        }
        now.next = data;
    }

    public boolean deleteMidNode(Node n) {
        if (n == null || n.next == null) return false;
        Node changeData = n.next;
        n.data = changeData.data;
        n.next = changeData.next;
        return true;
    }

    public String toString() {
        if (this.head == null) return "";
        StringBuilder sb = new StringBuilder();
        Node now = this.head;
        while (now.next != null) {
            sb.append(now.data);
            sb.append(" ");
            now = now.next;
        }
        sb.append(now.data);
        return sb.toString();
    }

}
