package org.example.inflearn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Q0302Test {

    @Test
    void solution() {
        Q0302 sut = new Q0302();
        List<Integer> expected;
        List<Integer> actual;

        expected = new ArrayList<>(Arrays.asList(2, 3, 5));
        actual = sut.solution(5, 5,
            new int[]{1, 3, 9, 5, 2},
            new int[]{3, 2, 5, 7, 8});
        assertThat(actual).isEqualTo(expected);

    }
}