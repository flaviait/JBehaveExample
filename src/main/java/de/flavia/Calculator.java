package de.flavia;

/**
 * Author: Dennis Fricke
 * Date: 16.10.2014
 */
public class Calculator {

    private Double result;

    public void divide(double firstNumber, double secondNumber) throws ArithmeticException {
        result = firstNumber / secondNumber;
    }

    public Double getResult() {
        return result;
    }
}
