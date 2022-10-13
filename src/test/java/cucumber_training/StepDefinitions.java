package cucumber_training;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitions {

    SimpleCalculator calculator;
    int result;
    ArithmeticException exception;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new SimpleCalculator();
    }

    @When("I call addNumbers with {int} and {int}")
    public void i_call_add_with_and(Integer a, Integer b) {
        result = calculator.addNumbers(a, b);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expectedNumber) {
        assertEquals(result, (int) expectedNumber);
    }

    @When("I call subtractNumbers with {int} and {int}")
    public void i_call_subtract_numbers_with_and(Integer a, Integer b) {
        result = calculator.subtractNumbers(a, b);
    }

    @When("I call divideNumbers with {int} and {int}")
    public void i_call_divide_numbers_with_and(Integer a, Integer b) throws ArithmeticException {
        try {
            result = calculator.divideNumbers(a, b);
        }
        catch(ArithmeticException e) {
            exception = e;
        }

    }

    @Then("arithmeticexception should be thrown")
    public void exception_should_be_thrown() {
        Assert.assertNotNull(exception);
    }
}