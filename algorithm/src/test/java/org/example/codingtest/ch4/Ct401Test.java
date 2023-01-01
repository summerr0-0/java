package org.example.codingtest.ch4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct401Test {
    @Test
    void solutionTest() {
        Ct401 sut = new Ct401();
        boolean actual = sut.solution(new int[][]{
            {0, 1, 0, 0, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
        }, 0, 1);

        assertThat(actual).isTrue();
    }

    @Test
    void solutionTest2() {
        Ct401 sut = new Ct401();
        boolean actual = sut.solution(new int[][]{
            {0, 1, 0, 0, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
        }, 1, 2);

        assertThat(actual).isFalse();
    }
}