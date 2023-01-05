package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0507Test {

    @Test
    void solution() {
        Q0507 sut = new Q0507();
        String expected;
        String actual;

        expected = "YES";
        actual = sut.solution("CBA", "CBDAGE");

        assertThat(actual).isEqualTo(expected);

    }
}