package com.jaiman.calculator;

import com.jaiman.calculator.exception.InternalOperationException;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class InfixToPostfixEvaluatorImplTest {

    @Test
    public void evaluateTest() throws InternalOperationException {
        InfixToPostfixEvaluatorImpl infixToPostfixEvaluator = new InfixToPostfixEvaluatorImpl();
        LinkedList<Object> result = infixToPostfixEvaluator.evalautePostfix("3+5*6");
        Assert.assertEquals("[3, 5, 6, *, +]", result.toString());
    }

}
