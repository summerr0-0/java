package org.example.inflearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q0705Test {
    Q0705 tree;
    @BeforeEach
    void init(){
        tree = new Q0705();
        tree.root = new Q0705.Node(1);
        tree.root.lt = new Q0705.Node(2);
        tree.root.rt = new Q0705.Node(3);
        tree.root.lt.lt = new Q0705.Node(4);
        tree.root.lt.rt = new Q0705.Node(5);
        tree.root.rt.lt = new Q0705.Node(6);
        tree.root.rt.rt = new Q0705.Node(7);
    }

    @Test
    void solution1() {
        Q0705 sut = new Q0705();
        sut.solution1(tree.root);
    }

    @Test
    void solution2() {
        Q0705 sut = new Q0705();
        sut.solution2(tree.root);
    }

    @Test
    void solution3() {
        Q0705 sut = new Q0705();
        sut.solution3(tree.root);
    }
}