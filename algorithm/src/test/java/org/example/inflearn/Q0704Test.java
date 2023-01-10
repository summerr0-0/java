package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0704Test {

    @Test
    void solution() {
        Q0704 sut = new Q0704();
        String expected = "1 1 2 3 5 8 13 21 34 55";
        String actual = sut.solution(10);

        assertThat(actual).isEqualTo(expected);

    }
}