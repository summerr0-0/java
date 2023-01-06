package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0602Test {

    @Test
    void solutionTest() {
        Q0602 sut = new Q0602();

        String expected = "5 7 11 13 15 23";
        String actual = sut.solution(6, new int[]{13, 5, 11, 7, 23, 15});
        assertThat(actual).isEqualTo(expected);

         expected = "1 2 3 4 5 6 7 8 9";
         actual = sut.solution(9, new int[]{3, 7, 1, 5, 4, 2, 9, 8, 6});
        assertThat(actual).isEqualTo(expected);

         expected = "53 56 56 62 64 68 68 69 89 93";
         actual = sut.solution(10, new int[]{56, 68, 62, 69, 64, 89, 56, 68, 93, 53 });
        assertThat(actual).isEqualTo(expected);

        expected = "50 53 54 55 55 55 56 61 67 68 69 72 72 73 74 75 75 77 80 82 82 82 82 85 88 91 92 93 95 98";
        actual = sut.solution(30, new int[]{88, 74, 68, 55, 72, 50, 55, 56, 93, 82, 75, 95, 67, 82, 80, 91, 82, 72, 54, 61, 73, 82, 92, 77, 75, 85, 69, 55, 53, 98 });
        assertThat(actual).isEqualTo(expected);


    }


}