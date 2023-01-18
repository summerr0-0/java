package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0801Test {

    @Test
    void solution() {
        Q0801 sut = new Q0801();
        String expected;
        String actual;

        expected = "YES";
        actual = sut.solution(new int[]{1, 3, 5, 6, 7, 10});
        assertThat(actual).isEqualTo(expected);

        expected = "NO";
        actual = sut.solution(new int[]{3, 6, 13, 11, 7, 16, 34, 23, 12});

        assertThat(actual).isEqualTo(expected);

    }
}