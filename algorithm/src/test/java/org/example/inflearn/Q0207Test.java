package org.example.inflearn;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0207Test {

    @Test
    void solution() {
        Q0207 sut = new Q0207();
        int expected = 0;
        int actual = 0;

        expected = 10;
        actual = sut.solution(new int[] {
            1, 0, 1, 1, 1, 0, 0, 1, 1, 0});

        assertThat(actual).isEqualTo(expected);

    }
}