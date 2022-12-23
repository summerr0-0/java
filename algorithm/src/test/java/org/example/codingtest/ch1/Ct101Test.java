package org.example.codingtest.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct101Test {

    @Test
    void solution() {
     Ct101 sut = new Ct101();
     boolean expected;
     boolean actual;

     expected = false;
     actual = sut.solution("aabc");
     assertThat(actual).isEqualTo(expected);

        expected = true;
        actual = sut.solution("abc");

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void solution2() {
        Ct101 sut = new Ct101();
        boolean expected;
        boolean actual;

        expected = false;
        actual = sut.solution2("aabc");
        assertThat(actual).isEqualTo(expected);

        expected = true;
        actual = sut.solution2("abc");

        assertThat(actual).isEqualTo(expected);

    }
}