package org.example.creditcalculator.v2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;



class GradeCalculatorTest {

    @Test
    void 평균학점을_계산한다() {
        List<Course> courses = List.of(
            new Course("OOP", 3, "A+"),
            new Course("자료구조", 3, "A+")
        );

        GradeCalculator sut = new GradeCalculator(courses);


        Assertions.assertThat(sut.calculateGrade()).isEqualTo(4.5);

    }
}