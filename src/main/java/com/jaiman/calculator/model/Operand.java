package com.jaiman.calculator.model;

import java.math.BigDecimal;

public class Operand {

    private final BigDecimal value;

    public Operand(BigDecimal bigDecimal) {
        this.value = bigDecimal;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
