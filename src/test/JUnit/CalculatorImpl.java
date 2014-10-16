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
public class CalculatorImpl {

    private Calculator calculator = new Calculator();

    @Test
    public void firstNumberIsGreaterThanZero() {
        calculator.divide(20.0, 5.0);
        assertEquals(this.calculator.getResult(), Double.valueOf(4.0));
    }

    @Test
    public void firstNumberIsEqualZero() {
        calculator.divide(20.0, 0.0);
        assertTrue(Double.isInfinite(this.calculator.getResult()));
    }

}
