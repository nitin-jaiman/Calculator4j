package com.jaiman.calculator;

import com.jaiman.calculator.model.Operand;
import com.jaiman.calculator.model.operators.Operator;

import java.util.LinkedList;

public class InfixToPostfixEvaluatorImpl implements InfixToPostfixEvaluator {
    public LinkedList<Object> evalautePostfix(String infix) {
        return null;
    }

    public LinkedList<Object> evaluatePostfix(LinkedList<String> infix) {
        return null;
    }

    private LinkedList<Object> evaluate(LinkedList<Object> infix) {

        for(Object object: infix){
            if(object instanceof Operator){

            }else if(object instanceof Operand){

            }else{
                throw new IllegalStateException("This type of operator or operand is not supported");
            }
        }
        return null; //TODO: Add implementation
    }
}
