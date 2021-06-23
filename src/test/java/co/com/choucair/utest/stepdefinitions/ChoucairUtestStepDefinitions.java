package co.com.choucair.utest.stepdefinitions;
import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.questions.AnswerValidation;
import co.com.choucair.utest.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class ChoucairUtestStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Given("^that Juan wants to register as a new user on the utes page$")
    public void thatJuanWantsToRegisterAsANewUserOnTheUtesPage() throws Exception {
        theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^He fills the registration form for new users$")
    public void HeFillsTheRegistrationFormForNewUsers(List<UtestData> utestData) throws Exception {
        theActorInTheSpotlight().attemptsTo(RegisterPersonaldata.the(utestData), RegisterAddressData.the(utestData), RegisterDeviceData.the(utestData), RegisterSecurityData.the(utestData));
    }

    @Then("^he completes the registration of the new user$")
    public void heCompletesTheRegistrationOfTheNewUser(List<UtestData> utestData) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerValidation.toThe(utestData.get(0).getNamePage())));
    }
}
