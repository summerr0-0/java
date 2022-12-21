package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0306Test {

    @Test
    void solution() {
        Q0306 sut = new Q0306();
        int expected;
        int actual;

        expected = 8;
        actual = sut.solution(14, 2, new int[]{1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1});

        assertThat(actual).isEqualTo(expected);

    }
}