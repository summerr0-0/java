package org.example.codingtest.ch3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct302Test {
    Ct302 sut;
    @BeforeEach
    void init(){
        sut = new Ct302();
        sut.push(5);
        sut.push(6);
        sut.push(3);
        sut.push(1);
        sut.push(8);

    }

    @Test
    void pushTest() {
        assertThat(sut.toString()).isEqualTo("8 1 3 6 5");
    }

    @Test
    void peekTest() {
        assertThat(sut.peek()).isEqualTo(8);
        assertThat(sut.peek()).isEqualTo(8);

    }

    @Test
    void popTest() {
        assertThat(sut.pop()).isEqualTo(8);
        assertThat(sut.pop()).isEqualTo(1);
        assertThat(sut.pop()).isEqualTo(3);
        assertThat(sut.pop()).isEqualTo(6);
        assertThat(sut.pop()).isEqualTo(5);
        assertThat(sut.pop()).isEqualTo(-1);

    }

    @Test
    void minTest() {
        assertThat(sut.min()).isEqualTo(1);
        sut.pop();
        sut.pop();
        assertThat(sut.min()).isEqualTo(3);

    }

}