package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0405Test {

    @Test
    void solution() {
        Q0405 sut = new Q0405();
        int expected;
        int actual;

        expected = 143;
        actual = sut.solution(10, 3, new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42});
        assertThat(actual).isEqualTo(expected);

    }
}