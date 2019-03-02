package com.jaiman.calculator;

import com.jaiman.calculator.model.Operand;

import java.math.BigDecimal;
import java.util.LinkedList;

public interface PostfixRuleEngine {
    Operand resolveExpression(LinkedList<Object> postfix);
}
