package co.com.choucair.utest.task;
import co.com.choucair.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest.userinterface.PersonalDataPage.*;

public class RegisterPersonaldata implements Task {

    List<UtestData> utestData;

    public RegisterPersonaldata(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static RegisterPersonaldata the(List<UtestData> utestData){
        return Tasks.instrumented(RegisterPersonaldata.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(JOIN_BUTTON),
                Enter.theValue(utestData.get(0).getName()).into(INPUT_NAME),
                Enter.theValue(utestData.get(0).getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(utestData.get(0).getEmailAddress()).into(INPUT_EMAIL),
                Click.on(BOX_MONTH.of(utestData.get(0).getMonth())),
                Click.on(BOX_DAY.of(utestData.get(0).getDay())),
                Click.on(BOX_YEAR.of(utestData.get(0).getYear())),
                Click.on(BOX_IDIOMA),
                Click.on(SELECT.of(utestData.get(0).getIdioma())),

                Click.on(ENTER_BUTTON)

        );









    }
}
