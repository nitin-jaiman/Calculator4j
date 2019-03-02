package com.jaiman.calculator.model.operators;

import com.jaiman.calculator.model.Operand;

import java.math.BigDecimal;

public class MultiplicationOperator implements Operator {
    private static final String identifier = "*";
    private static final int priority = 10;

    public BigDecimal evlauate(Operand firstOperand, Operand secondOperand) {
        return firstOperand.getValue().multiply(secondOperand.getValue());
    }

    public boolean isHighPriority(Operator operator) {
        return getPriority() <= operator.getPriority();
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
