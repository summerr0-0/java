package org.example.codingtest.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Ct103Test {

    @Test
    void solution() {
        Ct103 sut = new Ct103();
        String expected;
        String actual;

        actual = sut.solution("Mr John Smith",13);
        expected = "Mr%20John%20Smith";
        assertThat(actual).isEqualTo(expected);

    }

}