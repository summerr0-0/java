package org.example.inflearn;

import org.example.inflearn.Q0110;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0110Test {

    @Test
    void solution() {
        Q0110 sut = new Q0110();
        String expected = "1 0 1 2 1 0 1 2 2 1 0";
        String actual = sut.solution("teachermode", "e");

        assertThat(actual).isEqualTo(expected);
    }
}