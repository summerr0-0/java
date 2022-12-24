package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0401Test {

    @Test
    void solution() {

        Q0401 sut = new Q0401();
        String expected ="C";
        String actual = sut.solution("BACBACCACCBDEDE");

        assertThat(actual).isEqualTo(expected);

    }
}