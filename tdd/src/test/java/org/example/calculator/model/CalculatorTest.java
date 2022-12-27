package org.example.calculator.model;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 간단한 사칙연산을 할 수 있다
 * 양수로만 계산할 수 있다
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다
 * MVC 패턴 기반으로 구현한다
 */
class CalculatorTest {

    @Test
    void 입력값은_양수여야_한다() {
        Calculator sut = new Calculator();
        assertThatCode(()->sut.calculate(-1, "+", 2))
            .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 나눗셈은_0으로_나눌_수_없다() {
        Calculator sut = new Calculator();
        assertThatCode(()->sut.calculate(1, "/", 0))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사칙연산기호_외에는_들어올_수없다() {
        Calculator sut = new Calculator();

        assertThatCode(()->sut.calculate(1, "?", 2))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void 한번에_테스트_할_수도_있다(int operand1, String operator, int operand2, int expected) {
        Calculator sut = new Calculator();
        int actual = sut.calculate(operand1, operator, operand2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 덧셈테스트() {
        Calculator sut = new Calculator();
        int expected = 3;
        int actual = sut.calculate(1, "+", 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 뺄셈테스트() {
        Calculator sut = new Calculator();
        int expected = 1;
        int actual = sut.calculate(3, "-", 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 나눗셈테스트() {
        Calculator sut = new Calculator();
        int expected = 2;
        int actual = sut.calculate(4, "/", 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 곱셈테스트() {
        Calculator sut = new Calculator();
        int expected = 8;
        int actual = sut.calculate(4, "*", 2);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
            arguments(1, "+", 2, 3),
            arguments(1, "-", 2, -1),
            arguments(4, "*", 2, 8),
            arguments(4, "/", 2, 2)
        );
    }
}