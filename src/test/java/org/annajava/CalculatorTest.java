package org.annajava;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        Assert.assertEquals(5, calculator.add(2, 3));
    }
    @Test
    public void testSubtract(){
        Assert.assertEquals(-1, calculator.subtract(2, 3));
    }
    @Test
    public  void testMultiply(){
        Assert.assertEquals(6, calculator.multiply(2, 3));
    }
    @Test
    public void testDivide() throws IllegalAccessException {
        Assert.assertEquals(0.53, calculator.divide(2, 4), 0.001);
    }
    @Test(expected = IllegalAccessException.class)
    public void testDivideZero() throws IllegalAccessException {
        calculator.divide(2, 0);
    }
}