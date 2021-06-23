package co.com.choucair.utest.task;

import co.com.choucair.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.choucair.utest.userinterface.DeviceDataPage.*;

public class RegisterDeviceData implements Task {

    List<UtestData> utestData;

    public RegisterDeviceData(List<UtestData> utestData){

        this.utestData = utestData;
    }

    public static RegisterDeviceData the(List<UtestData> utestData){
        return Tasks.instrumented(RegisterDeviceData.class, utestData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOX_COMPUTER),
                Click.on(SELECT.of(utestData.get(0).getComputer())),

                Click.on(BOX_VERSION),
                Click.on(SELECT.of(utestData.get(0).getVersion())),

                Click.on(BOX_LANGUAGE),
                Click.on(SELECT.of(utestData.get(0).getLanguage())),

                Click.on(BOX_DEVICE),
                Click.on(SELECT.of(utestData.get(0).getMobileDevice())),

                Click.on(BOX_MODEL),
                Click.on(SELECT.of(utestData.get(0).getModel())),

                Click.on(BOX_OS),
                Click.on(SELECT.of(utestData.get(0).getOs())),

                Click.on(BUTTON_NEXT)
        );
    }
}
