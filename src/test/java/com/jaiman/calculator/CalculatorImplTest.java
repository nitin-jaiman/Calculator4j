package com.jaiman.calculator;

import com.jaiman.calculator.exception.InternalOperationException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorImplTest {
    @Test
    public void calculateTest() throws InternalOperationException {
        Calculator calculator = new CalculatorImpl();
        BigDecimal resultTest1 = calculator.calculate("3+3+4*5");
        Assert.assertEquals(26, resultTest1.intValue());

        BigDecimal resultTest2 = calculator.calculate("1231.4234+34234234.23423*23423423.342*32423");
        Assert.assertEquals(2.599945125285382e19, resultTest2.doubleValue(), 0.0000001);
    }
}
