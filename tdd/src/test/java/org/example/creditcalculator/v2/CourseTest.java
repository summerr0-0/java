package org.example.creditcalculator.v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @Test
    void 과목을_생성한다(){

        assertThatCode(()->new Course("중국어",3,"A+"))
            .doesNotThrowAnyException();
    }

}
