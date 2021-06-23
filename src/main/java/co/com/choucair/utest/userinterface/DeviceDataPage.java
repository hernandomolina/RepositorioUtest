package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeviceDataPage extends PageObject {

    public static final Target BOX_COMPUTER = Target.the("Seleccion de computador")
            .locatedBy("(//span[@class='ui-select-match-text pull-left ui-select-allow-clear'])[1]");
    public static final Target BOX_VERSION = Target.the("Seleccion de version de computador")
            .locatedBy("(//*[@class='ui-select-box'])[2]");
    public static final Target BOX_LANGUAGE = Target.the("Seleccion de lenguaje de computador")
            .locatedBy("(//*[@class='ui-select-box'])[3]");
    public static final Target BOX_DEVICE = Target.the("Seleccion de dispositivo")
            .locatedBy("(//*[@class='ui-select-box'])[4]");
    public static final Target BOX_MODEL = Target.the("Seleccion de modelo de dispositivo")
            .locatedBy("(//*[@class='ui-select-box'])[5]");
    public static final Target BOX_OS = Target.the("Seleccion de sistema operativo de dispositivo")
            .locatedBy("(//*[@class='ui-select-box'])[6]");
    public static final Target SELECT = Target.the("Seleccionador de opciones")
            .locatedBy("//*[contains(@id,'ui-select-choices-row-')]//div[text()='{0}']");
    public static final Target BUTTON_NEXT = Target.the("boton para continuar al sgte formulario")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
