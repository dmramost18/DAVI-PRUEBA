package Questions;

import UI.FlaticonUI;
import net.serenitybdd.screenplay.Question;


public class FlaticonQuestions {

    public static Question<String> formLogin() {
        return actor -> FlaticonUI.FORM_LOGIN.resolveFor(actor).getText().trim();

    }


    public static Question<String> continueGoogle() {
        return actor -> FlaticonUI.CONTINUE_GOOGLE.resolveFor(actor).getText().trim();
    }

    public static Question<String> continueApple() {
        return actor -> FlaticonUI.CONTINUE_APPLE.resolveFor(actor).getText().trim();
    }
    public static Question<String> continueEmail() {
        return actor -> FlaticonUI.CONTINUE_EMAIL.resolveFor(actor).getText().trim();
    }


    }

