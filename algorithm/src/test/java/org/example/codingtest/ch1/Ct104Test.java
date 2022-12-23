package org.example.codingtest.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct104Test {

    @Test
    void solution() {
        Ct104 sut = new Ct104();
        boolean expected;
        boolean actual;

        expected = true;
        actual = sut.solution("Tact Coa");

        assertThat(actual).isEqualTo(expected);

    }
}