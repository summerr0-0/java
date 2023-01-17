package org.example.inflearn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Q0713Test {

    @Test
    void solution() {
        Q0713 sut = new Q0713();
        int expected;
        int actual;

        List<List<Integer>> list = new ArrayList<>();


        list.add(Arrays.asList());
        list.add(Arrays.asList(2, 3, 4));
        list.add(Arrays.asList(1, 3, 5));
        list.add(Arrays.asList(4));
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(5));


        expected = 6;

        actual = sut.solution(5, list);

        assertThat(actual).isEqualTo(expected);

    }
}