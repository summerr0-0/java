package org.example.inflearn;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0201Test {

    @Test
    void solution() {
        Q0201 sut = new Q0201();
        String expected = "7 9 6 12";

        String actual = sut.solution(new int[]{7, 3, 9, 5, 6, 12});

        assertThat(actual).isEqualTo(expected);
    }
}