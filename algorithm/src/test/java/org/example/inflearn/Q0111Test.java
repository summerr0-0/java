package org.example.inflearn;

import org.example.inflearn.Q0111;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0111Test {

    @Test
    void solution() {
        Q0111 sut = new Q0111();

        String expected = "K2HS7E";
        String actual = sut.solution("KKHSSSSSSSE");
        assertThat(actual).isEqualTo(expected);


        expected = "KST3SE2KFK3DJ2G2";
        actual = sut.solution("KSTTTSEEKFKKKDJJGG");
        assertThat(actual).isEqualTo(expected);

    }
}