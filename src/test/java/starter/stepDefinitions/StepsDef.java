package starter.stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.AssertJUnit;

public class StepsDef {

    private String today;

    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        AssertJUnit.assertEquals(expectedAnswer, actualAnswer);
    }


}
