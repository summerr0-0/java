package org.example.inflearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q0710Test {
    Q0710 tree;
    @BeforeEach
    void init(){
        tree = new Q0710();
        tree.root = new Q0710.Node(1);
        tree.root.lt = new Q0710.Node(2);
        tree.root.rt = new Q0710.Node(3);
        tree.root.lt.lt = new Q0710.Node(4);
        tree.root.lt.rt = new Q0710.Node(5);
        tree.root.rt.lt = new Q0710.Node(6);
        tree.root.rt.rt = new Q0710.Node(7);
    }
    @Test
    void solution() {
        Q0710 sut = new Q0710();
        System.out.println(sut.solution(tree.root));
    }
}