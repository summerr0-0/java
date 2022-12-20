package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0212Test {

    @Test
    void solution() {
        Q0212 sut = new Q0212();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(4, 3,
            new int[][]{
                {3, 4, 1, 2},
                {4, 3, 2, 1},
                {3, 1, 4, 2}
            });

        assertThat(actual).isEqualTo(expected);

    }
}