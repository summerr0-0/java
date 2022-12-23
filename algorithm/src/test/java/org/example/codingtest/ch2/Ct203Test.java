package org.example.codingtest.ch2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ct203Test {
    Ct203.Node node1;
    Ct203.Node node2;
    Ct203.Node node3;
    Ct203.Node node4;
    Ct203.Node node5;
    Ct203 list;

    @BeforeEach
    void init() {
        list = new Ct203();
        node1 = new Ct203.Node("a");
        node2 = new Ct203.Node("b");
        node3 = new Ct203.Node("c");
        node4 = new Ct203.Node("d");
        node5 = new Ct203.Node("e");

        list.insertNode(node1);
        list.insertNode(node2);
        list.insertNode(node3);
        list.insertNode(node4);
        list.insertNode(node5);

    }

    @Test
    void deleteMidNodeTest(){
        list.deleteMidNode(node3);
        String expected = "a b d e";
        Assertions.assertThat(list.toString()).isEqualTo(expected);
    }
}