package org.example.calculator.model;

import org.assertj.core.api.Assertions;
import org.example.calculator.v3.PositiveNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PositiveNumberTest {
    @Test
    void 음수_생성시_예외가_발생한다() {
        Assertions.assertThatCode(() -> new PositiveNumber(-1))
            .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 정상동작() {
        PositiveNumber sut = new PositiveNumber(1);

        assertThat(sut.toInt()).isEqualTo(1);

    }
}