package org.example.codingtest.ch2;

import org.example.codingtest.ch2.Ct204;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Ct204Test {
    Ct204 sut;

    @BeforeEach
    void init() {
        sut = new Ct204();
        sut.insert(3);
        sut.insert(5);
        sut.insert(8);
        sut.insert(5);
        sut.insert(10);
        sut.insert(2);
        sut.insert(1);
    }

    @Test
    void partitionTest(){
        System.out.println(sut.toString());
        Ct204 list = sut.partition(5);

        System.out.println(list.toString());

    }

}