package com.jaiman.calculator;

import java.util.LinkedList;

public interface InfixToPostfixEvaluator {
    LinkedList<String> evalautePostfix(String infix);

    LinkedList<String> evaluatePostfix(LinkedList<String> infix);
}
