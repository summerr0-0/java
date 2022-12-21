package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0305Test {

    @Test
    void solution() {
        Q0305 sut = new Q0305();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(15);
        assertThat(actual).isEqualTo(expected);

    }
}