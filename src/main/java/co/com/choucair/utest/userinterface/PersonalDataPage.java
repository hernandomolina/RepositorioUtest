package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PersonalDataPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Boton para ingresar al formulario datos personales")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NAME = Target.the("caja de texto para nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("caja de texto para el apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("caja de texto para el email")
            .located(By.id("email"));
    public static final Target BOX_MONTH = Target.the("caja de seleccion mes de nacimiento")
            .locatedBy("//select[@id='birthMonth']//option[text()='{0}']");
    public static final Target BOX_DAY = Target.the("caja de seleccion dia de nacimiento")
            .locatedBy("//select[@id='birthDay']//option[text()='{0}']");
    public static final Target BOX_YEAR = Target.the("caja de seleccion año de nacimiento")
            .locatedBy("//select[@id='birthYear']//option[text()='{0}']");
    public static final Target SELECT = Target.the("Seleccionador de opcion")
            .locatedBy("//*[contains(@id,'ui-select-choices-row-')]//div[text()='{0}']");
    public static final Target BOX_IDIOMA = Target.the("caja de seleccion de idioma")
            .locatedBy("//div[@id='languages']");
    public static final Target ENTER_BUTTON = Target.the("boton para seguir al siguiente formulario")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));
}
