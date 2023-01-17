package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0610Test {

    @Test
    void solution() {
        Q0610 sut = new Q0610();
        int expected;
        int actual;

        actual = sut.solution(5, 3, new int[]{1, 2, 8, 4, 9});
        expected = 3;

        assertThat(actual).isEqualTo(expected);

    }
}