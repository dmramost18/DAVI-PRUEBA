package starter.stepDefinitions;


import Models.User;
import Questions.FlaticonQuestions;
import Task.GlobalTask;
import UI.FlaticonUI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class IconUserFormSteps {

    @When("^da clic en el icon user$")
    public void ctaIcon() {
        User miUsuario = new User("wilmaryoan.malaver@dxc.com", "123456");
        OnStage.theActorInTheSpotlight().attemptsTo(
                new GlobalTask(),
                WaitUntil.the(FlaticonUI.FORM_LOGIN, isVisible()).forNoMoreThan(10).seconds()
        );

    }

    @Then("^se visualiza el form de inicio de sesion$")
    public void expectResult(DataTable dataTable) {
        List<String> data = dataTable.asList();
        String title = data.get(0); // "Inicia sesión"
        String google = data.get(1); // "Continúa con google"
        String apple = data.get(2); // "Continúa con Apple"



        OnStage.theActorInTheSpotlight().should(

                seeThat("Se visualiza el título con el texto esperado",
                        FlaticonQuestions.formLogin(), equalTo(title)),


                //seeThat("Se visualiza el botón 'Continúa con Google'",
                       // FlaticonQuestions.continueGoogle(), equalTo(google)),

                seeThat("Se visualiza el botón 'Continúa con Apple'",
                        FlaticonQuestions.continueApple(), equalTo(apple))


        );
    }
}
