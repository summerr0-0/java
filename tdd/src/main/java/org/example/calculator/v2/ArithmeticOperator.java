package org.example.calculator.v2;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },
    SUBTRACTION("-") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },
    MULTIPLICATION("*") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },
    DIVISION("/") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            if (operand2 == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다");
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithmeticCalculate(final int operand1, final int operand2);

    //외부에 노출되는 public interface
    public static int calculate(int num1, String symbol, int num2) {
        if (num1 <= 0 || num2 <= 0) throw new IllegalArgumentException("양수로만 계산할 수 있습니다");

        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
            .filter(v -> v.operator.equals(symbol))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("올바른 연산자를 입력해주세요"));
        return arithmeticOperator.arithmeticCalculate(num1, num2);
    }
}

