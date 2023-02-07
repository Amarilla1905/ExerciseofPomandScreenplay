package com.co.conduit.stepsdefinitions;

import com.co.conduit.models.RegisterData;
import com.co.conduit.tasks.RegisterPageTasks;
import com.co.conduit.utils.Constants;
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

import java.util.List;

public class RegisterStepDefinition {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Sara");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^that the user enters the page$")
    public void thatTheUserEntersThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_HOME));
    }


    @When("^the user adds the data$")
    public void theUserAddsTheData(List<RegisterData> registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPageTasks.enter(registerData));


    }

    @Then("^it will be checked that it has been saved$")
    public void itWillBeCheckedThatItHasBeenSaved() {

    }

}
