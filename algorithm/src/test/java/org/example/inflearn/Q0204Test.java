package org.example.inflearn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0204Test {

    @Test
    void solution() {
        Q0204 sut = new Q0204();
        String expected = "1 1 2 3 5 8 13 21 34 55";

        String actual = sut.solution(10);

        assertThat(actual).isEqualTo(expected);

    }
}