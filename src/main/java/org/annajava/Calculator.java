package org.annajava;

public class Calculator {
    public int add (int a, int b){
        return a + b;
    }

    public int subtract (int a, int b){
        return a-b;
    }

    public int multiply (int a, int b){
        return a * b;
    }

    public double divide (double a, double b) throws IllegalAccessException {
        if (b== 0){
            throw new IllegalAccessException("Can't divide by zero!");
        }
        return a /b;
    }


}
