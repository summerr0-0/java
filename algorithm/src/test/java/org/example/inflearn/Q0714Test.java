package org.example.inflearn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0714Test {

    @Test
    void solution() {

        Q0714 sut = new Q0714();
        int expected;
        int actual;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            list.add(new ArrayList<Integer>());
        }

        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(1);
        list.get(2).add(5);
        list.get(3).add(4);
        list.get(4).add(5);
        list.get(4).add(6);
        list.get(6).add(2);
        list.get(6).add(5);

        expected = 6;

        sut.solution(list);

        //        assertThat(actual).isEqualTo(expected);

    }

}