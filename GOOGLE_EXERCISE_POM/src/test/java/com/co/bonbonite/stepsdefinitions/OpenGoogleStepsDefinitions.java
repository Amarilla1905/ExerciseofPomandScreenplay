package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.steps.OpenGoogleStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OpenGoogleStepsDefinitions {

    @Steps
    OpenGoogleStep openGoogleStep;





    @Given("^the user opens the google page$")
    public void theUserOpensTheGooglePage() {
        openGoogleStep.openPage();


    }


    @When("^the user enters the page$")
    public void theUserEntersThePage() {


    }

    @Then("^he can check the logo of google$")
    public void heCanCheckTheLogoOfGoogle() {

    }

}
