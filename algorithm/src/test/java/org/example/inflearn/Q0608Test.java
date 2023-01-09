package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0608Test {

    @Test
    void solution() {
        Q0608 sut = new Q0608();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(8, 32, new int[]{23, 87, 65, 12, 57, 32, 99, 81});

        assertThat(actual).isEqualTo(expected);

    }
}