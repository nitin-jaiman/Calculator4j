package com.jaiman.calculator.model.operators;

import com.jaiman.calculator.model.Operand;

import java.math.BigDecimal;

public interface Operator {
    Operand evlauate(Operand firstOperand, Operand secondOperand);

    boolean isHighPriority(Operator operator);

    int getPriority();
}
