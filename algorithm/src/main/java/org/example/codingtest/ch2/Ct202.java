package org.example.codingtest.ch2;

//뒤에서 k번째 원소 구하기: 단방향 연결리스트가 주어졌을 때 뒤에서 k번째
//    원소를 찾는 알고리즘을 구현하라.
public class Ct202 {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //삽입
    public void insertData(int num) {
        if (this.head == null) {
            this.head = new Node(num);
            return;
        }

        Node now = head;
        while (now.next != null) {
            now = now.next;
        }
        now.next = new Node(num);
    }

    //삭제
    public boolean deleteData(int num) {
        if (this.head == null) return false;

        Node now = this.head;
        if (now.data == num) {
            this.head = this.head.next;
            return true;
        }

        while (now.next.next != null) {
            if (now.next.data == num) {
                now.next = now.next.next;
                return true;
            }
            now = now.next;
        }
        return false;
    }

    //마지막에서 N번째 구하기
    public int getLast(int index) {
        if (this.head == null) return -1;
        Node p1 = this.head;
        Node p2 = this.head;

        //이동한다
        for (int i = 0; i < index; i++) {
            if (p1 == null) return -1;
            p1 = p1.next;
        }

        //p1이 끝에 도달하면 p2는 마지막-index 번째를 반환한다
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.data;
    }

    //toString
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
