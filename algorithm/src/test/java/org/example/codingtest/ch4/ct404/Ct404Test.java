package org.example.codingtest.ch4.ct404;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct404Test {
    Tree tree;

    Tree.Node createBalancedTree() {
        tree = new Tree();

        Tree.Node node1 = tree.createNode(1);
        Tree.Node node2 = tree.createNode(2);
        Tree.Node node3 = tree.createNode(3);
        Tree.Node node4 = tree.createNode(4);
        Tree.Node node5 = tree.createNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        return node1;
    }

    Tree.Node createUnBalancedTree() {
        tree = new Tree();

        Tree.Node node1 = tree.createNode(1);
        Tree.Node node2 = tree.createNode(2);
        Tree.Node node3 = tree.createNode(3);
        Tree.Node node4 = tree.createNode(4);
        Tree.Node node5 = tree.createNode(5);
        Tree.Node node6 = tree.createNode(6);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.right = node6;


        return node1;
    }

    @Test
    void solution() {
        Tree.Node root = createBalancedTree();
        Ct404_v2 sut = new Ct404_v2();

        assertThat(sut.solution(root)).isTrue();
    }
    @Test
    void solution2() {
        Tree.Node root = createUnBalancedTree();
        Ct404_v2 sut = new Ct404_v2();

        assertThat(sut.solution(root)).isFalse();
    }
}