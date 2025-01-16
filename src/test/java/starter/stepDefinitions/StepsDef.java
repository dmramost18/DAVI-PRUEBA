package starter.stepDefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static junit.framework.TestCase.assertEquals;

public class StepsDef {


    private String actualAnswer;

    @Given("today is {string}")
    public void today_is_Sunday(String text) {
        OnStage.theActorInTheSpotlight().remember("today", text);
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(OnStage.theActorInTheSpotlight().recall("today"));
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
