package org.example.inflearn;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0209Test {

    @Test
    void solution() {
        Q0209 sut = new Q0209();
        int expected = 0;
        int actual = 0;

        expected = 155;
        actual = sut.solution(new int[][]{
                {10, 13, 10, 12, 15},
                {12, 39, 30, 23, 11},
                {11, 25, 50, 53, 15},
                {19, 27, 29, 37, 27},
                {19, 13, 30, 13, 19}
            });
        assertThat(actual).isEqualTo(expected);
    }

}