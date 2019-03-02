package com.jaiman.calculator.model.operators;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.util.List;

public class OperatorFactory {
    private static final String SUPPORTED_OPERATORS = "supportedOperators";

    public static Operator getOperator(String operator) {
        switch (operator) {
            case "+":
                return new AdditionOperator();
            case "*":
                return new MultiplicationOperator();
            default:
                throw new IllegalArgumentException("Operator " + operator + " is not supported");
        }
    }

    private static void validate(String operator) throws ConfigurationException {
        PropertiesConfiguration configs = new PropertiesConfiguration("configurations.properties");
        List<Object> supportedOperators = configs.getList(SUPPORTED_OPERATORS);
        if (!supportedOperators.contains(operator)) {
            throw new IllegalArgumentException("Operator " + operator + " is not supported");
        }
    }
}
