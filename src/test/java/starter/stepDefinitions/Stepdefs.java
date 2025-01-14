package starter.stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertEquals;

class IsItFriday {
public class Stepdefs {

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
            assertEquals(expectedAnswer, actualAnswer);
        }

}
}
