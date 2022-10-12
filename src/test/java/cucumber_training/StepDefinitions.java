package cucumber_training;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class StepDefinitions {

    SimpleCalculator calculator;
    int result;

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
        assertTrue(result == expectedNumber);
    }

    @When("I call subtractNumbers with {int} and {int}")
    public void i_call_subtract_numbers_with_and(Integer a, Integer b) {
        result = calculator.subtractNumbers(a, b);
    }

    @When("I call divideNumbers with {int} and {int}")
    public void i_call_divide_numbers_with_and(Integer a, Integer b) {
        result = calculator.divideNumbers(a, b);
    }
    @Then("exception should be thrown")
    public void exception_should_be_thrown() {
        Assert.assertThrows(ArithmeticException.class, () -> calculator.divideNumbers(1,0));
    }
}