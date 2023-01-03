package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0501Test {

    @Test
    void solution() {
        Q0501 sut = new Q0501();
        String expected;
        String actual;

        expected = "YES";
        actual = sut.solution("(())()");
        assertThat(actual).isEqualTo(expected);

        expected = "NO";
        actual = sut.solution("(()()))");
        assertThat(actual).isEqualTo(expected);


        expected = "NO";
        actual = sut.solution("(()(()))(()");
        assertThat(actual).isEqualTo(expected);

    }
}

