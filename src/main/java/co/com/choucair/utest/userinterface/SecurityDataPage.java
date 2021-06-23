package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecurityDataPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("caja de texto para ingresar contraseña")
            .located(By.id("password"));
    public static final Target INPUT_CONFIR_PASSWORD = Target.the("caja de texto para confirmar contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY = Target.the("aceptar recibir info por email")
            .located(By.xpath("//label[@class='input-check-box signup-consent signup-consent--highlight']"));
    public static final Target CHECK_TERM = Target.the("aceptar terminos y condiciones")
            .located(By.xpath("//input[@id='termOfUse']"));
    public static final Target CHECK_PRIVACY = Target.the("aceptar terminos de privacidad")
            .located(By.xpath("//input[@id='privacySetting']"));
    public static final Target BUTTON_COMPLETE = Target.the("Boton de finalizar registro")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target NAME_PAGE = Target.the("Nombre de la pagina")
            .located(By.xpath("//div[@class='step-header h3']//span[@class='sub-title']"));

}
