package org.example.codingtest.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct102Test {

    @Test
    void solution() {
        Ct102 sut = new Ct102();
        boolean expected;
        boolean actual;

        expected = true;
        actual = sut.solution("abc","cba");
        assertThat(actual).isEqualTo(expected);

        expected = false;
        actual = sut.solution("abc","cbd");
        assertThat(actual).isEqualTo(expected);
    }
}