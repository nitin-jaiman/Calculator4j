package com.jaiman.calculator.model;

import java.math.BigDecimal;

public class Operand extends BigDecimal {
    public Operand(char[] in, int offset, int len) {
        super(in, offset, len);
    }
}
