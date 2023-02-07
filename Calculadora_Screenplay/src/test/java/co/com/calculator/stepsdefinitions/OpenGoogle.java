package co.com.calculator.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class OpenGoogle {
    @Managed
    WebDriver hisDriver;


    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Sara");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^that the user opens the google page \"([^\"]*)\"$")
    public void thatTheUserOpensTheGooglePage(String arg1) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(arg1));

    }

    @When("^the user enters the Google page\\.$")
    public void theUserEntersTheGooglePage() {

    }

    @Then("^you can check the Google logo$")
    public void youCanCheckTheGoogleLogo() {

    }
}
