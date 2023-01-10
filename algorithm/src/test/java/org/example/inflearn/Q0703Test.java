package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0703Test {

    @Test
    void solution() {
        Q0703 sut = new Q0703();
        int expected;
        int actual;

        expected = 120;
        actual = sut.solution(5);

        assertThat(actual).isEqualTo(expected);

    }
}