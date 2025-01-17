package starter.stepDefinitions;

import Models.User;
import Task.ClicButtonEmail;
import Task.GlobalTask;
import Task.SendInfo;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class SendDataFomrSteps {

    @When("^Ingresa para iniciar sesion con email$")
    public void buttonEmail() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new GlobalTask(),
                new ClicButtonEmail()
        );
    }

    @When("^Ingresamos datos en el formulario$")
    public void ingressData() {
        User miUsuario = new User("wilmaryoan.malaver@dxc.com", "123456");
        OnStage.theActorInTheSpotlight().attemptsTo(
                SendInfo.emailAndPass(miUsuario.getEmail(), miUsuario.getPassword())
        );

    }

    @When("^no se visualicen advertencias$")
    public void expectResult() {
    }
}
