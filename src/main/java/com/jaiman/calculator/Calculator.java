package com.jaiman.calculator;

import com.jaiman.calculator.exception.InternalOperationException;

import java.math.BigDecimal;

public interface Calculator {
    BigDecimal calculate(String infixExpression) throws InternalOperationException;
}
