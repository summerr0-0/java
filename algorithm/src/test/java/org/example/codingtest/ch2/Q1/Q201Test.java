package org.example.codingtest.ch2.Q1;

import org.example.codingtest.ch2.Q1.LinkedList;
import org.example.codingtest.ch2.Q1.Q201;
import org.junit.jupiter.api.Test;


class Q201Test {

    @Test
    void solution() {
        Q201 sut = new Q201();
        LinkedList expected;
        LinkedList actual;

        expected = new LinkedList();
        expected.addNode(1);
        expected.addNode(2);
        expected.addNode(3);

        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        expected.printAll();
        sut.solution(list).printAll();

    }

    @Test
    void solution2() {
        Q201 sut = new Q201();
        LinkedList expected;

        expected = new LinkedList();
        expected.addNode(1);
        expected.addNode(2);
        expected.addNode(3);

        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        expected.printAll();
        sut.solution2(list).printAll();

    }
}