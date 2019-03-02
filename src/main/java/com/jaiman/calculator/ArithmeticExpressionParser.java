package com.jaiman.calculator;

import com.jaiman.calculator.model.Operand;
import com.jaiman.calculator.model.operators.Operator;
import com.jaiman.calculator.model.operators.OperatorFactory;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticExpressionParser {

    private static final String SUPPORTED_OPERATORS = "supportedOperators";

    public static LinkedList<Object> parseArithmeticExpression(String arithmeticExpression) throws ConfigurationException {
        validate(arithmeticExpression);
        LinkedList<Object> infixArithmeticExpression = new LinkedList<>();
        PropertiesConfiguration configs = new PropertiesConfiguration("configurations.properties");

        List<String> supportedOperators = configs.getList(SUPPORTED_OPERATORS).stream().map(o -> (String) o).collect(Collectors.toList());
        int currentBeginningIndex = 0;
        for (int i = 0; i < arithmeticExpression.length(); i++) {
            char currentChar = arithmeticExpression.charAt(i);
            if (supportedOperators.contains(String.valueOf(currentChar))) {
                Operand operand = new Operand(new BigDecimal(arithmeticExpression.substring(currentBeginningIndex, i)));
                Operator operator = OperatorFactory.getOperator(String.valueOf(currentChar));
                infixArithmeticExpression.add(operand);
                infixArithmeticExpression.add(operator);
                currentBeginningIndex = i + 1;
            }
        }
        Operand operand = new Operand(new BigDecimal(arithmeticExpression.substring(currentBeginningIndex, arithmeticExpression.length())));
        infixArithmeticExpression.add(operand);
        return infixArithmeticExpression;
    }

    private static void validate(String arithmeticExpression) {
        if (StringUtils.isBlank(arithmeticExpression)) {
            throw new IllegalArgumentException("ArithmeticExpression cannot be null blank or empty");
        }
    }

}
