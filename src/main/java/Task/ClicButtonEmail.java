package Task;

import UI.FlaticonUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ClicButtonEmail implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FlaticonUI.REJECT_ALL),
                Click.on(FlaticonUI.BUTTON_EMAIL)
        );
    }
}
