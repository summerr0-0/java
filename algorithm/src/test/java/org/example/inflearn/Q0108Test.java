package org.example.inflearn;

import org.example.inflearn.Q0108;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0108Test {

    @Test
    void solution() {
        Q0108 sut = new Q0108();
        String result = sut.solution("found7, time: study; Yduts; emit, 7Dnuof");
        assertThat(result).isEqualTo("YES");

        result = sut.solution("found7, timk: study; Yduts; emit, 7Dnuof");
        assertThat(result).isEqualTo("NO");

        result = sut.solution("Tae,aba;e#%a*T");
        assertThat(result).isEqualTo("YES");

        result = sut.solution("kdjg$@kjkldjkg%@dkjgkj");
        assertThat(result).isEqualTo("NO");

        result = sut.solution("a sd fg #%hjkl; %#$@! lkj&*hgfd s ##a");
        assertThat(result).isEqualTo("YES");
    }
}