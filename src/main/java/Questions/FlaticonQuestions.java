package Questions;

import UI.FlaticonUI;
import net.serenitybdd.screenplay.Question;


public class FlaticonQuestions {

    public static Question<String> formLogin() {
        return actor -> FlaticonUI.FORM_LOGIN.resolveFor(actor).getText().trim();
    }

}
