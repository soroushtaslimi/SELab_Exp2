package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private static final double EPSILON = 0.0001;
    private Calculator calculator;
    private int value1;
    private String opt;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }


    @Given("^One value and one operator, (\\d+) and (.*)$")
    public void oneValueAndOneOperatorAnd(int arg0, String arg1) {
        value1 = arg0;
        opt = arg1;
    }

    @When("^I operate the operator on operand$")
    public void iOperateTheOperatorOnOperand() {
        result = calculator.operate(value1, opt);
    }

    @Then("^I expect the result (.+)$")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result, EPSILON);
    }
}
