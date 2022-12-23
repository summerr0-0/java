package org.example.codingtest.ch2;

import org.example.codingtest.ch2.Ct202;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct202Test {
    Ct202 sut;

    @BeforeEach
    void init() {
        sut = new Ct202();
        sut.insertData(1);
        sut.insertData(2);
        sut.insertData(3);
        sut.insertData(4);
        sut.insertData(5);
        sut.insertData(6);
    }

    @Test
    void getLastTest() {
        int expected = 5;
        int actual = sut.getLast(2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void toStringTest(){
        System.out.println(sut.toString());
    }

}