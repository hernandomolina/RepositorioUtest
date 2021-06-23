package co.com.choucair.utest.task;

import co.com.choucair.utest.model.UtestData;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest.userinterface.AddressDataPage.*;

public class RegisterAddressData implements Task {

    List<UtestData> utestData;

    public RegisterAddressData(List<UtestData> utestData){

        this.utestData = utestData;
    }

    public static RegisterAddressData the(List<UtestData> utestData){
        return Tasks.instrumented(RegisterAddressData.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.get(0).getCity()).into(INPUT_CITY),
                Enter.theValue(utestData.get(0).getPostalCode()).into(INPUT_CODEPOSTAL),
                Click.on(BOX_COUNTRY),
                Click.on(SELECT.of(utestData.get(0).getCountry())),
                Click.on(BUTTON_NEXT_DEVICES)

        );

    }
}
