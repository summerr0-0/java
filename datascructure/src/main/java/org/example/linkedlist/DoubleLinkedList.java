package org.example.linkedlist;

public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            tail.next = new Node<>(data);
            tail.next.prev = tail;
            this.tail = tail.next;
        }
    }

    //데이터를 임의 노드 앞에 노드를 추가하는 메서드 추가하기
    public Boolean insertToFront(T existedData, T addData) {
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = new Node<>(addData);
            return true;
        } else if (this.head.data == existedData) {
            Node<T> newHead = new Node<>(addData);
            this.head.prev = newHead;
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {

                    Node<T> nodePrev = node.prev;
                    nodePrev.next = new Node<T>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                }
                node = node.next;
            }
            if (node == this.tail) {
                node.next = new Node<>(existedData);
                node.next.prev = node;
                this.tail = node.next;
                return true;
            }
        }
        return false;
    }


    public T searchFromHead(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                }
                node = node.next;
            }
        }
        return null;
    }

    public T searchFromTail(T isData) {
        if (this.tail != null) {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                }
                node = node.prev;
            }
        }
        return null;
    }


    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(this.head.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(6, 2);
        MyLinkedList.insertToFront(1, 0);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.addNode(6);
        MyLinkedList.printAll();
    }
}
