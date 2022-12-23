package org.example.codingtest.ch2.Q1;

public class LinkedList {
    public Node head = null;

    public class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addNode(int data) {
        //비어 있을 때
        if (head == null) {
            this.head = new Node(data);
            return;
        }
        //값 찾기
        Node now = this.head;
        while (now.next != null) {
            now = now.next;
        }
        now.next = new Node(data);
    }

    public boolean deleteNode(int deleteData) {
        if (this.head == null) return false;

        Node now = this.head;
        if (now.data == deleteData) {
            this.head = now.next;
            return true;
        }

        while (now.next.next != null) {
            if(now.next.data == deleteData){
                now.next = now.next.next;
                return true;
            }
            now = now.next;
        }
        return false;
    }

    public void printAll() {
        if (this.head == null) return;

        Node node = this.head;
        while (node.next != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
