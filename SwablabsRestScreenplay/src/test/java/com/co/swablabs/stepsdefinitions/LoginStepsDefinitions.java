package com.co.swablabs.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class LoginStepsDefinitions {
    Actor Sara = Actor.named("Sara");


    @Given("he user is in the web page")
    public void heUserIsInTheWebPage() {
        Sara.whoCan(CallAnApi.at(URL));

    }

    @When("the user his login")
    public void theUserHisLogin() {

    }


    @Then("the user obtain token")
    public void theUserObtainToken() {

    }

}
