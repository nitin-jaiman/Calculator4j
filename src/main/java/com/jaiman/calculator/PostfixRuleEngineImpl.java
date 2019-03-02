package com.jaiman.calculator;

import com.jaiman.calculator.model.Operand;
import com.jaiman.calculator.model.operators.Operator;

import java.util.LinkedList;
import java.util.Stack;

public class PostfixRuleEngineImpl implements PostfixRuleEngine {
    @Override
    public Operand resolveExpression(LinkedList<Object> postfix) {
        Stack<Operand> operandStack = new Stack<Operand>();
        for(Object object: postfix){
            if(object instanceof Operator){
                Operand firstOperand = operandStack.pop();
                Operand secondOperand = operandStack.pop();
                Operand result = ((Operator) object).evlauate(firstOperand, secondOperand);
                operandStack.push(result);
            }else if(object instanceof Operand){
                operandStack.push((Operand) object);
            }else{
                throw new IllegalStateException("Operation not supported: Cannot resolve to operand or operator "+object.toString());
            }
        }
        return operandStack.pop();
    }
}
