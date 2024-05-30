package org.example.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumericCalculatorTest {

    private NumericCalculator calculator;

    @BeforeEach
    void beforeAll() {
        this.calculator = new NumericCalculator();
    }

    @Test
    void testEvalAdd() {
        final String expression = "1+2";
        assertEquals(calculator.eval(expression), 3.0D);
    }

    @Test
    void testEvalSubtract() {
        final String expression = "3-1";
        assertEquals(calculator.eval(expression), 2.0D);
    }

    @Test
    void testEvalMultiply() {
        final String expression = "3*2";
        assertEquals(calculator.eval(expression), 6.0D);
    }

    @Test
    void testEvalDivide() {
        final String expression = "3/2";
        assertEquals(calculator.eval(expression), 1.5D);
    }

    @Test
    void testEvalException() {
        final String expression = "1%2";
        assertThrows(UnsupportedOperationException.class, () -> calculator.eval(expression));
    }
}