package com.co.conduit.stepsdefinitions;


import com.co.conduit.models.LoginData;
import com.co.conduit.tasks.LoginPageTasks;
import com.co.conduit.utils.Constants;
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

public class LoginStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Sara");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }




    @Given("^that the user enters the page of Login in Conduit$")
    public void thatTheUserEntersThePageOfLoginInConduit() {
    theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_HOME));
    }

    @When("^the user logs in$")
    public void theUserLogsIn(List<LoginData> loginDataList) {
        LoginData loginData;
        loginData = loginDataList.get(0);

        theActorInTheSpotlight().attemptsTo(LoginPageTasks.loginPageTask(loginData));

    }

    @Then("^the user name is checked$")
    public void theUserNameIsChecked() {

    }
}
