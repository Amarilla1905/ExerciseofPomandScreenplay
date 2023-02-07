package co.com.conduit.stepsdefinitions;

import co.com.conduit.models.EnterDataLogin;
import co.com.conduit.tasks.LoginPageTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginConduitStepDefinition {


    @Managed
    WebDriver hisBrowser;
    @Before
    public void setIni(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Sara");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that the user enters the page$")
    public void thatTheUserEntersThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://angular.realworld.io"));


    }

    @When("^the user logs in$")
    public void theUserLogsIn(List<EnterDataLogin> enterDataLoginList) {

        EnterDataLogin enterDataLogin;
        enterDataLogin= enterDataLoginList.get(0);

    theActorInTheSpotlight().attemptsTo(LoginPageTask.loginPageTask(enterDataLogin));


    }


    @Then("^the user name is checked$")
    public void theUserNameIsChecked() {


    }

}
