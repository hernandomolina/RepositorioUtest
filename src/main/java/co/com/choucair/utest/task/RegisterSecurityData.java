package co.com.choucair.utest.task;

import co.com.choucair.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;


import static co.com.choucair.utest.userinterface.SecurityDataPage.*;

public class RegisterSecurityData implements Task {

    List<UtestData> utestData;

    public RegisterSecurityData(List<UtestData> utestData) {
        this.utestData = utestData;

    }

    public static RegisterSecurityData the(List<UtestData> utestData){
        return Tasks.instrumented(RegisterSecurityData.class, utestData);
        }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(utestData.get(0).getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.get(0).getConfirPassword()).into(INPUT_CONFIR_PASSWORD),
                Click.on(CHECK_STAY),
                Click.on(CHECK_TERM),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_COMPLETE)

        );

    }
}
