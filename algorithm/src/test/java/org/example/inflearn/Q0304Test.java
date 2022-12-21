package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0304Test {

    @Test
    void solution() {
        Q0304 sut = new Q0304();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(8, 6, new int[]{1, 2, 1, 3, 1, 1, 1, 2});
        assertThat(actual).isEqualTo(expected);

    }
}