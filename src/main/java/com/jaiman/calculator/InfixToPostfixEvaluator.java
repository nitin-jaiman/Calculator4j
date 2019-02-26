package com.jaiman.calculator;

import java.util.LinkedList;

public interface InfixToPostfixEvaluator {
    LinkedList<Object> evalautePostfix(String infix);

    LinkedList<Object> evaluatePostfix(LinkedList<String> infix);
}
