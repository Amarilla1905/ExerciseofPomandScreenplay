package stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Sara");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));

    }


    @Given("^he user enters in the page$")
    public void heUserEntersInThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.google.com"));


    }


    @When("^he user fills in the corresponding$")
    public void heUserFillsInTheCorresponding() {

    }

    @Then("^the account is successfully created$")
    public void theAccountIsSuccessfullyCreated() {
    }



}
