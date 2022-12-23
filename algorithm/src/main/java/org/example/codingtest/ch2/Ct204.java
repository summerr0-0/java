package org.example.codingtest.ch2;

public class Ct204 {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //삽입
    public void insert(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        Node now = this.head;
        while (now.next != null) {
            now = now.next;
        }
        now.next = new Node(data);
    }

    //삭제
    public boolean delete(int data){
        if(this.head == null) return false;

        Node now = this.head;
        if(now.data == data){
            this.head = now.next;
            return true;
        }

        while (now.next.next!= null){
            //삭제
            if(now.next.data == data){
                now.next = now.next.next;
                return true;
            }
            now = now.next;
        }
        return false;
    }

    //tostring
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

    //원소이동
    public Ct204 partition (int x){
       Ct204 before = new Ct204();
       Ct204 after = new Ct204();
       Ct204 newList = new Ct204();
       Node now = this.head;

       while (now != null){
           if(now.data<x){
               before.insert(now.data);
           }else {
               after.insert(now.data);
           }
           now = now.next;
       }

        System.out.println(before.toString());
        System.out.println(after.toString());

       Node beforeNow = before.head;
       while (beforeNow != null){
           newList.insert(beforeNow.data);
           beforeNow = beforeNow.next;
       }

        Node afterNow = after.head;
        while (afterNow != null){
            newList.insert(afterNow.data);
            afterNow = afterNow.next;
        }

        return newList;
    }


}
