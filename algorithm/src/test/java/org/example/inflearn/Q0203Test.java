package org.example.inflearn;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0203Test {

    @Test
    void solution() {
        Q0203 sut = new Q0203();
        int[] userA = new int[]{2, 3, 3, 1, 3};
        int[] userB = new int[]{1, 1, 2, 2, 3};
        List<String> expected = Arrays.asList("A", "B", "A", "B", "D");

        List<String> actual = sut.solution(userA, userB);

        assertThat(expected).isEqualTo(actual);
    }
}