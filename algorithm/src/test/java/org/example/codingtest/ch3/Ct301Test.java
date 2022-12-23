package org.example.codingtest.ch3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct301Test {
    Ct301 sut;

    @BeforeEach
    void init(){
    sut = new Ct301(5);
    sut.push(0,1);
    sut.push(0,2);
    sut.push(0,3);

    sut.push(1,6);
    sut.push(1,7);
    sut.push(1,8);
    sut.push(1,9);
    sut.push(1,3);

    }
    @Test
    void toStringTest(){
        assertThat(sut.toString(0)).isEqualTo("1 2 3");
        assertThat(sut.toString(1)).isEqualTo("6 7 8 9 3");
        assertThat(sut.toString(2)).isEqualTo("");
    }

    @Test
    void pushTest(){
        boolean push = sut.push(1, 0);
        assertThat(push).isFalse();
    }

    @Test
    void popTest(){
        assertThat(sut.pop(0)).isEqualTo(3);
        assertThat(sut.pop(0)).isEqualTo(2);
        assertThat(sut.pop(1)).isEqualTo(3);
        assertThat(sut.pop(1)).isEqualTo(9);
        assertThat(sut.pop(2)).isEqualTo(-1);
    }

    @Test
    void peekTest(){
        assertThat(sut.peek(0)).isEqualTo(3);
        assertThat(sut.peek(0)).isEqualTo(3);
        assertThat(sut.peek(1)).isEqualTo(3);
        assertThat(sut.peek(1)).isEqualTo(3);
        assertThat(sut.peek(2)).isEqualTo(-1);
    }

    @Test
    void isFull(){
        assertThat(sut.isFull(0)).isFalse();
        assertThat(sut.isFull(1)).isTrue();
        assertThat(sut.isFull(2)).isFalse();

    }

    @Test
    void isEmpty(){
        assertThat(sut.isEmpty(0)).isFalse();
        assertThat(sut.isEmpty(1)).isFalse();
        assertThat(sut.isEmpty(2)).isTrue();

    }

}