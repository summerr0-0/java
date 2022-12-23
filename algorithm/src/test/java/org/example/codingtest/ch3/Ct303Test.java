package org.example.codingtest.ch3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ct303Test {

    Ct303 sut;
    @BeforeEach
    void init(){
        sut = new Ct303();
        sut.push(5);
        sut.push(6);
        sut.push(3);
        sut.push(1);
        sut.push(8);

    }

    @Test
    void pushTest() {
        assertThat(sut.toString()).isEqualTo("5 6 3 1 8");
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


}