package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0812Test {

    @Test
    void solution() {

        Q0812 sut = new Q0812();
        int expected;
        int actual;

//        expected = 4;
//        actual = sut.solution(6, 4, new int[][]{
//            {0, 0, -1, 0, 0, 0},
//            {0, 0, 1, 0, -1, 0},
//            {0, 0, -1, 0, 0, 0},
//            {0, 0, 0, 0, -1, 1}
//
//        });
//
//        assertThat(actual).isEqualTo(expected);

        expected = 5;
        actual = sut.solution(10, 10, new int[][]{
            {0, -1, 0, -1, 1 ,- 1, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, -1, 0, -1,},
            {1, 0, 0, 0, -1, 0, 1, -1, 0, 0,},
            {0, 0, 0, 0, 0, -1, 0, 0, 0, 0,},
            {0, 1, 0, 1, 0, 0, 1, 0, 0, 0,},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0,},
            {0, 0, -1, 0, 0, 0, 0, 0, -1, 0,},
            {-1, 0, 0, 0, -1, 0, 0, 0, 0, 0,},
            {0, 0, -1, 0, 0, 0, 0, 1, 0, 0,}

        });

        assertThat(actual).isEqualTo(expected);

    }
}