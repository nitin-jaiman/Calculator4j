package com.jaiman.calculator;

import com.jaiman.calculator.exception.InternalOperationException;

import java.math.BigDecimal;

public class CalculatorImpl implements Calculator {
    @Override
    public BigDecimal calculate(String infixExpression) throws InternalOperationException {
        InfixToPostfixEvaluator infixToPostfixEvaluator = new InfixToPostfixEvaluatorImpl();
        PostfixRuleEngine postfixRuleEngine = new PostfixRuleEngineImpl();
        return postfixRuleEngine.resolveExpression(infixToPostfixEvaluator.evalautePostfix(infixExpression)).getValue();
    }
}
