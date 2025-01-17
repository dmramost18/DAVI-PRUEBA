package Task;

import UI.FlaticonUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class SendInfo {

    public static Performable email() {
        return Task.where("{0} Click en el boton de email",
                Click.on(FlaticonUI.REJECT_ALL),
                Click.on(FlaticonUI.BUTTON_EMAIL)
        );
    }

    public static Performable emailAndPass(String email, String password) {
        return Task.where("{0} ingresa email y contraseña",
                // con ambos pueden enviar valores a los campos
                Enter.theValue(email).into(FlaticonUI.INPUT_EMAIL),
                SendKeys.of("").into(FlaticonUI.INPUT_PASSWORD)
        );
    }
}
