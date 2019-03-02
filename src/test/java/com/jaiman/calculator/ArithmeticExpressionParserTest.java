package com.jaiman.calculator;

import org.apache.commons.configuration.ConfigurationException;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class ArithmeticExpressionParserTest {

    @Test
    public void parseArithmeticExpressionTest() throws ConfigurationException {
        ArithmeticExpressionParser arithmeticExpressionParser = new ArithmeticExpressionParser();
        LinkedList<Object> infix = arithmeticExpressionParser.parseArithmeticExpression("3.45689475+54508347856*66456.45454");
        Assert.assertEquals("[3.45689475, +, 54508347856, *, 66456.45454]", infix.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseArithmeticExpressionWithNullRequest() throws ConfigurationException {
        ArithmeticExpressionParser arithmeticExpressionParser = new ArithmeticExpressionParser();
        arithmeticExpressionParser.parseArithmeticExpression(null);
    }


    @Test(expected = IllegalArgumentException.class)
    public void parseArithmeticExpressionWithBlankRequest() throws ConfigurationException {
        ArithmeticExpressionParser arithmeticExpressionParser = new ArithmeticExpressionParser();
        arithmeticExpressionParser.parseArithmeticExpression(" ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseArithmeticExpressionWithUnSupportedOperatorRequest() throws ConfigurationException {
        ArithmeticExpressionParser arithmeticExpressionParser = new ArithmeticExpressionParser();
        arithmeticExpressionParser.parseArithmeticExpression("3%4");
    }
}
