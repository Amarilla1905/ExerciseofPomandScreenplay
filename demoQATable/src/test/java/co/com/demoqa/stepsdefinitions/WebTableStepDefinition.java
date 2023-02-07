package co.com.demoqa.stepsdefinitions;

import co.com.demoqa.tasks.EnterData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class WebTableStepDefinition {

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
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/webtables"));

    }


    @When("^the user adds the data$")
    public void theUserAddsTheData() {
        theActorInTheSpotlight().attemptsTo(EnterData.enterData());

    }

    @Then("^it will be checked that it has been saved$")
    public void itWillBeCheckedThatItHasBeenSaved() {

    }
}
