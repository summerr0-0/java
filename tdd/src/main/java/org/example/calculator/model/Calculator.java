package org.example.calculator.model;

import org.example.calculator.model.v3.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public int calculate(int num1, String symbol, int num2) {
        //v2
        //        return ArithmeticOperator.calculate(num1, symbol, num2);

        //v3
        return arithmeticOperators.stream()
            .filter(v -> v.supports(symbol))
            .map(v -> v.calculate(new PositiveNumber(num1), new PositiveNumber(num2)))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("올바른 사칙 연산이 아닙니다"));
    }

    //v1
    //    public int calculate(int num1, String symbol, int num2) {
    //        if (num1 <= 0 || num2 <= 0) throw new IllegalArgumentException("양수로만 계산할 수 있습니다");
    //
    //        switch (symbol) {
    //            case "+":
    //                return num1 + num2;
    //            case "-":
    //                return num1 - num2;
    //            case "/": {
    //                if (num2 == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다");
    //                return num1 / num2;
    //            }
    //            case "*":
    //                return num1 * num2;
    //            default:
    //                throw new IllegalArgumentException("연산자를 찾을 수 없습니다");
    //        }
    //    }
}
