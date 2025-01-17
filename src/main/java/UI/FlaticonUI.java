package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.ResolvableElement;
import net.serenitybdd.screenplay.targets.Target;

public class FlaticonUI {

    public static final Target ICON_USER = Target.the("Icon User")
            .locatedBy("//*[@id=\"gr_not-connected\"]/a/i");

    public static final Target FORM_LOGIN = Target.the("Form Login")
            .locatedBy("//h5[text()='Inicia sesión']");

    public static final Target CONTINUE_APPLE = Target.the("Continue with Apple")
            .located(By.xpath("//span[text()='Continúa con Apple']"));

    public static final Target CONTINUE_GOOGLE = Target.the("Continue with Google")
            .located(By.xpath("//span[text()='Continuar con Google']"));


    public static final Target CONTINUE_EMAIL = Target.the("Continue with Email")
            .located(By.xpath("//span[text()='Continúa con email']"));

    public static final Target CREATE_ACCOUNT = Target.the("Create Account")
            .locatedBy("//p[text()='¿Todavía no tienes una cuenta? ']");

    public static final Target COOKIES = Target.the("Cookies")
            .locatedBy("//button[text()='Configuración de cookies']");



}
