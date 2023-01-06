package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0604Test {

    @Test
    void solution() {
        Q0604 sut = new Q0604();
        String expected;
        String actual;

//        expected = "7 5 3 2 6";
//        actual = sut.solution(5,9,new int[]{1,2,3,2,6,2,3,5,7});
//        assertThat(actual).isEqualTo(expected);


        expected = "7 5 3 2 6 1";
        actual = sut.solution(10,9,new int[]{1,2,3,2,6,2,3,5,7});
        assertThat(actual).isEqualTo(expected);
    }
}