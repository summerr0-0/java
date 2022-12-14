package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q1010Test {

    @Test
    void solution() {
        Q1010 sut = new Q1010();
        String expected = "1 0 1 2 1 0 1 2 2 1 0";
        String actual = sut.solution("teachermode", "e");

        assertThat(actual).isEqualTo(expected);
    }
}