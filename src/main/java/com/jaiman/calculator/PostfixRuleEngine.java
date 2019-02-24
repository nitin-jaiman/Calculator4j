package com.jaiman.calculator;

import java.math.BigDecimal;
import java.util.LinkedList;

public interface PostfixRuleEngine {
    BigDecimal resolveExpression(LinkedList<String> postfix);
}
