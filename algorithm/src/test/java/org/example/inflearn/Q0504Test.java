package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0504Test {

    @Test
    void solution() {
        Q0504 sut = new Q0504();
        int expected;
        int actual;

        expected = 12;
        actual = sut.solution("352+*9-");
        assertThat(actual).isEqualTo(expected);

        expected = 16;
        actual = sut.solution("35+2*");
        assertThat(actual).isEqualTo(expected);

        expected = 30;
        actual = sut.solution("573*+5-323*++");
        assertThat(actual).isEqualTo(expected);

        expected = 21;
        actual = sut.solution("58+65*+32+-73*-5-323*++");
        assertThat(actual).isEqualTo(expected);

        expected = 24;
        actual = sut.solution("58+65*+32+-73*-5-323*++53+2+52*-+3+");
        assertThat(actual).isEqualTo(expected);


    }
}