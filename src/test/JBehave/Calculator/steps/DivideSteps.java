package JBehave.Calculator.steps;

import de.flavia.Calculator;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DivideSteps {

    private Double firstNumber;
    private Double secondNumber;
    private Calculator calculator = new Calculator();

    @Given("the first number is twenty")
    public void createFirstNumber() {
        firstNumber = 20.0;
    }

    @Given("the second number is five")
    public void createSecondNumber() {
        secondNumber = 5.0;
    }

    @Given("the second number is zero")
    public void createSecondNumberAsZero() {
        secondNumber = 0.0;
    }

    @When("the first number is divided by the second number")
    public void divideFirstNumberGreaterThanZero() {
        calculator.divide(firstNumber, secondNumber);
    }

    @When("the first number is divided by the second number (zero)")
    public void divideFirstNumberEqualsZero() {
        calculator.divide(firstNumber, secondNumber);
    }

    @Then("the result should be returned four")
    public void resultShouldBeFour() {
        assertEquals(calculator.getResult(), Double.valueOf(4.0));
    }

    @Then("the result should be return infinity")
    public void resultShouldBeInfinity() {
        assertTrue(Double.isInfinite(calculator.getResult()));
    }

}
