package starter.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class FlaticonSteps {

    @Given("^(.*) tiene acceso a flaticon$")
    public void usuarioTieneAFlaticon(String actor) {
        // Write code here that turns the phrase above into concrete actions
       theActorCalled(actor).attemptsTo(
               Open.browserOn().thePageNamed("pages.Icons"));
    }

    @When("^Realizo una busqueda$")
    public void ctaIcon() {
    }

    @Then("^se visualiza el resultado de la busqueda$")
    public void expectResult() {
    }
}
