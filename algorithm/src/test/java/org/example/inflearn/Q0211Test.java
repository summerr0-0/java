package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0211Test {

    @Test
    void solution() {
        Q0211 sut = new Q0211();
        int expected;
        int actual;

        expected = 4;
        actual = sut.solution(new int[][]{
            {2, 3, 1, 7, 3},
            {4, 1, 9, 6, 8},
            {5, 5, 2, 4, 4},
            {6, 5, 2, 6, 7},
            {8, 4, 2, 2, 2}});

        assertThat(actual).isEqualTo(expected);

        expected = 2;
        actual = sut.solution(new int[][]{
            {5, 4, 4, 2, 1},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 7, 8}
        });

        assertThat(actual).isEqualTo(expected);

        expected = 3;
        actual = sut.solution(new int[][]{
            {9, 8, 7, 6, 5},
            {5, 6, 7, 8, 9},
            {1, 2, 3, 7, 8},
            {4, 5, 3, 4, 2},
            {6, 2, 8, 4, 2}

        });

        assertThat(actual).isEqualTo(expected);


    }
}