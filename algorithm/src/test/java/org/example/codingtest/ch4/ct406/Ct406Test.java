package org.example.codingtest.ch4.ct406;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct406Test {

    @Test
    void getNextInOrderTest() {
        Ct406 sut = new Ct406();
        Ct406.Node rootB = new Ct406.Node(4);
        rootB.left = new Ct406.Node(2);
        rootB.left.parent = rootB;
        rootB.right = new Ct406.Node(6);
        rootB.right.parent = rootB;
        rootB.left.left = new Ct406.Node(1);
        rootB.left.left.parent = rootB.left;
        rootB.left.right = new Ct406.Node(3);
        rootB.left.right.parent = rootB.left;
        rootB.right.left = new Ct406.Node(5);
        rootB.right.left.parent = rootB.right;
        rootB.right.right = new Ct406.Node(7);
        rootB.right.right.parent = rootB.right;

        assertThat(sut.getNextInOrder(rootB.left.right).data).isEqualTo(4);
    }
}