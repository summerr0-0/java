package org.example.inflearn;

import org.example.inflearn.Q0112;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0112Test {

    @Test
    void solution() {
        Q0112 sut = new Q0112();
        String expected = "COOL";
        String actual = sut.solution(4, "#****###**#####**#####**##**");

        assertThat(actual).isEqualTo(expected);
    }
}