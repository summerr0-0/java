package org.example.linkedlist;

import org.junit.jupiter.api.Test;


class SingleLinkedListTest {

    @Test
    void nodeTest(){
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addNodeToTail(1);
        System.out.println(list.head.data);
        System.out.println("==============================");
        list.addNodeToTail(2);
        System.out.println(list.head.next.data);
        System.out.println("=================================");
        list.addNodeToTail(5);
        list.addNodeToTail(4);
        list.printAll();
        System.out.println("=================================");
        list.addNodeInside(8, 2);
        list.printAll();
        System.out.println("==============================");
        list.addNodeInside(9, 10);
        list.printAll();
        System.out.println("==============================");
        list.deleteNode(1);
        list.printAll();
        System.out.println("==============================");
        list.deleteNode(5);
        list.printAll();
        System.out.println(list.deleteNode(100));
    }


}