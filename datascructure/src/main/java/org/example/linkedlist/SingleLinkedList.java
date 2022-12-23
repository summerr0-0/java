package org.example.linkedlist;

public class SingleLinkedList<T> {
    Node<T> head = null;

    class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    //노드를 더한다
    public void addNodeToTail(T data) {
        if (head == null) {
            this.head = new Node(data);
        } else {
            Node<T> node = this.head;
            Node<T> newNode = new Node<>(data);

            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    //중간에 노드를 넣는다
    public void addNodeInside(T data, T insertData) {
        Node<T> searchNode = this.searchNode(data);
        if (searchNode == null) {
            this.addNodeToTail(insertData);
        } else {
            Node<T> nextNode = searchNode.next;
            Node<T> insertNode = new Node<>(insertData);
            searchNode.next = insertNode;
            insertNode.next = nextNode;
        }
    }

    //노드를 삭제한다
    public boolean deleteNode(T delData) {
        if (this.head == null) return false;

        Node<T> node = this.head;
        if (node.data == delData) {
            this.head = this.head.next;
            return true;
        }
        while (node.next.next != null) {
            if (node.next == delData) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void printAll() {
        if (this.head == null) return;

        Node<T> node = this.head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    private Node<T> searchNode(T data) {
        if (head == null) return null;
        Node<T> now = this.head;
        while (now.next != null) {
            if (now.data == data) {
                return now;
            }
            now = now.next;
        }
        return null;
    }

}
