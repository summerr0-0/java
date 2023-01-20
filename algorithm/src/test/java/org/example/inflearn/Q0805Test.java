package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0805Test {

    @Test
    void solution() {
        Q0805 sut = new Q0805();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(3, new Integer[]{1, 2, 5}, 15);

        assertThat(actual).isEqualTo(expected);

        expected = 5;
        actual = sut.solution(5, new Integer[]{1, 8, 20,25,50}, 129);
        assertThat(actual).isEqualTo(expected);

    }
}