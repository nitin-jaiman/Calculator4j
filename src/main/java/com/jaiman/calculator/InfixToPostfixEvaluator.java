package com.jaiman.calculator;

import com.jaiman.calculator.exception.InternalOperationException;

import java.util.LinkedList;

public interface InfixToPostfixEvaluator {
    LinkedList<Object> evalautePostfix(String infix) throws InternalOperationException;

    LinkedList<Object> evaluatePostfix(LinkedList<String> infix) throws InternalOperationException;
}
