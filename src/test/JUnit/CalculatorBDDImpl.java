package JUnit;

import de.flavia.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Author: Dennis Fricke
 * Date: 16.10.2014
 */

@RunWith(JUnit4.class)
public class CalculatorBDDImpl {

    private Calculator calculator = new Calculator();

    @Test
    public void firstNumberIsGreaterThanZero() {
        //given
        Double firstnumber = firstNumberIsTwenty();
        //And
        Double secondNumber = SecondNumberIsFive();
        //when
        divideTheFirstNumberByTheSecondNumber(firstnumber, secondNumber, this.calculator);
        //then
        theReturnValueShouldBeFour();
    }

    @Test
    public void firstNumberIsEqualZero() {
        //given
        Double firstnumber = firstNumberIsTwenty();
        //And
        Double secondNumber = secondNumberIsZero();
        //when
        divideTheFirstNumberByTheSecondNumber(firstnumber, secondNumber, this.calculator);
        //then
        theReturnValueShouldBeInfinity();
    }

    private Double SecondNumberIsFive() {
        return 5.0;
    }

    private Double firstNumberIsTwenty() {
        return 20.0;
    }

    private Double secondNumberIsZero() {
        return 0.0;
    }

    private void theReturnValueShouldBeFour() {
        assertEquals(calculator.getResult(), Double.valueOf(4.0));
    }

    private void theReturnValueShouldBeInfinity() {
        assertTrue(Double.isInfinite(this.calculator.getResult()));
    }

    private void divideTheFirstNumberByTheSecondNumber(Double firstnumber, Double secondNumber, Calculator calculator) {
        this.calculator.divide(firstnumber, secondNumber);
    }

}
