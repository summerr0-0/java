package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0503Test {

    @Test
    void solution() {
        Q0503 sut = new Q0503();
        int expected;
        int actual;

        expected = 4;
        actual = sut.solution(5,
            new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
            },
            8,
            new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        assertThat(actual).isEqualTo(expected);

    }
}