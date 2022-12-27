package org.example.calculator.model.v3;

import org.example.calculator.model.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);

}
