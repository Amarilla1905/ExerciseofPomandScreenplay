package com.co.google.stepsdefinitions;


import com.co.google.Constants;
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

public class OpenGoogleStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Sara");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^the user opens the google page$")
    public void theUserOpensTheGooglePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_HOME));
    }

    @When("^the user enters the page$")
    public void theUserEntersThePage() {

    }

    @Then("^he can check the logo of google$")
    public void heCanCheckTheLogoOfGoogle() {

    }

}
