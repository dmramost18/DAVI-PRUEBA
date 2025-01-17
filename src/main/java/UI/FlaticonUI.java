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

    public static final Target BUTTON_EMAIL = Target.the("Continue with Email")
            .located(By.xpath("//button[.='Continúa con email']"));

    public static final Target CREATE_ACCOUNT = Target.the("Create Account")
            .locatedBy("//p[text()='¿Todavía no tienes una cuenta? ']");

    public static final Target COOKIES = Target.the("Cookies")
            .locatedBy("//button[text()='Configuración de cookies']");

    public static final Target REJECT_ALL = Target.the("Reject All")
            .locatedBy("//*[@id=\"onetrust-reject-all-handler\"]");


    /* Elementos de la visual de ingreso con Email */

    public static final Target INPUT_EMAIL = Target.the("Email")
            .locatedBy("//*[@id=\"log-in\"]/div[1]/form/div[1]/label/input");

    public static final Target INPUT_PASSWORD = Target.the("Password")
            .locatedBy("//*[@id=\"log-in\"]/div[1]/form/div[2]/label/input");

    public static final Target ADVERTENCIA = Target.the("Advertencia de ingreso de dato")
            .locatedBy("//*[@id=\"log-in\"]/div[1]/form/div[1]/div/p");







}
