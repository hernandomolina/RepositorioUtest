package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class AddressDataPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("Seleccion de ciudad")
            .located(By.id("city"));
    public static final Target INPUT_CODEPOSTAL = Target.the("Seleccion de codigo postal")
            .located(By.id("zip"));
    public static final Target SELECT = Target.the("Seleccionador de opciones")
            .locatedBy("//*[contains(@id,'ui-select-choices-row-')]//div[text()='{0}']");
    public static final Target BOX_COUNTRY = Target.the("Seleccionador de pais")
            .locatedBy("//div[@name='countryId']");
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Boton para continuar al sgte formaulario")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
