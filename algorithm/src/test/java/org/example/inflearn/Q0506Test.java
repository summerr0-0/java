package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0506Test {

    @Test
    void solution() {
        Q0506 sut = new Q0506();
        int expected;
        int actual;

        actual = sut.solution(8, 3);
        expected = 7;

        assertThat(actual).isEqualTo(expected);

    }
}