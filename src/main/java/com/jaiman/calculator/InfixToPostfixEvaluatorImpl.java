package com.jaiman.calculator;

import com.jaiman.calculator.exception.InternalOperationException;
import com.jaiman.calculator.model.Operand;
import com.jaiman.calculator.model.operators.Operator;
import org.apache.commons.configuration.ConfigurationException;

import java.util.LinkedList;
import java.util.Stack;

public class InfixToPostfixEvaluatorImpl implements InfixToPostfixEvaluator {

    private static final Stack<Operator> operatorStack = new Stack<>();

    public LinkedList<Object> evalautePostfix(String infix) throws InternalOperationException {
        try {
            return evaluatePostfixForInfixList(ArithmeticExpressionParser.parseArithmeticExpression(infix));
        } catch (ConfigurationException e) {
            throw new InternalOperationException(e);
        }

    }

    public LinkedList<Object> evaluatePostfix(LinkedList<String> infix) {
        return null; //TODO: Add implementation
    }

    private LinkedList<Object> evaluatePostfixForInfixList(LinkedList<Object> infix) {
        LinkedList<Object> postfix = new LinkedList<>();
        for (Object object : infix) {
            if (object instanceof Operator) {
                LinkedList<Operator> higherPrecedenceOperator = getOperatorsOfHigherPrecedenceFromStack((Operator) object);
                postfix.addAll(higherPrecedenceOperator);
                operatorStack.push((Operator) object);
            } else if (object instanceof Operand) {
                postfix.add(object);
            } else {
                throw new IllegalStateException("This type of operator or operand is not supported");
            }
        }
        postfix.addAll(operatorStack);
        return postfix;
    }

    private LinkedList<Operator> getOperatorsOfHigherPrecedenceFromStack(Operator operator) {
        LinkedList<Operator> operatorsFromStackOfHigherPrecedence = new LinkedList<>();
        while (!operatorStack.isEmpty() && operatorStack.peek().isHighPriority(operator)) {
            operatorsFromStackOfHigherPrecedence.add(operatorStack.pop());
        }
        return operatorsFromStackOfHigherPrecedence;
    }
}
