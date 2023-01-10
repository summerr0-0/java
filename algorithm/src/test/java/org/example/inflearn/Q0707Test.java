package org.example.inflearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q0707Test {
    Q0707 tree;
    @BeforeEach
    void init(){
        tree = new Q0707();
        tree.root = new Q0707.Node(1);
        tree.root.lt = new Q0707.Node(2);
        tree.root.rt = new Q0707.Node(3);
        tree.root.lt.lt = new Q0707.Node(4);
        tree.root.lt.rt = new Q0707.Node(5);
        tree.root.rt.lt = new Q0707.Node(6);
        tree.root.rt.rt = new Q0707.Node(7);
    }

    @Test
    void solution1() {
        Q0707 sut = new Q0707();
        sut.BFS(tree.root);
    }


}