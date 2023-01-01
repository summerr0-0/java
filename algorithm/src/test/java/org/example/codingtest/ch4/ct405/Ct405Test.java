package org.example.codingtest.ch4.ct405;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class Ct405Test {
    Tree tree;

    Tree.Node createBST() {
        tree = new Tree();

        Tree.Node node1 = tree.createNode(20);
        Tree.Node node2 = tree.createNode(10);
        Tree.Node node3 = tree.createNode(30);
        Tree.Node node4 = tree.createNode(5);
        Tree.Node node5 = tree.createNode(15);
        Tree.Node node6 = tree.createNode(3);
        Tree.Node node7 = tree.createNode(7);
        Tree.Node node8 = tree.createNode(17);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        node4.right = node7;
        node5.right = node8;

        return node1;
    }

    Tree.Node createUnBST() {
        tree = new Tree();

        Tree.Node node1 = tree.createNode(20);
        Tree.Node node2 = tree.createNode(10);
        Tree.Node node3 = tree.createNode(30);
        Tree.Node node4 = tree.createNode(5);
        Tree.Node node5 = tree.createNode(15);
        Tree.Node node6 = tree.createNode(12);
        Tree.Node node7 = tree.createNode(7);
        Tree.Node node8 = tree.createNode(17);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        node4.right = node7;
        node5.right = node8;


        return node1;
    }

    @Test
    void solution() {
        Tree.Node root = createBST();
        Ct405 sut = new Ct405();

        assertThat(sut.solution(root)).isTrue();
    }

    @Test
    void solution2() {
        Tree.Node root = createUnBST();
        Ct405 sut = new Ct405();

        assertThat(sut.solution(root)).isFalse();
    }
}
