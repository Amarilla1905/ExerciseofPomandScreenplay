package co.com.conduit.stepsdefinitions;

import co.com.conduit.tasks.RegisterPageTask;
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

public class RegisterConduitStepDefinition {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setIni(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Sara");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }




    @When("^the user adds the data$")
    public void theUserAddsTheData() {

        theActorInTheSpotlight().attemptsTo(RegisterPageTask.registerPage());

    }

    @Then("^it will be checked that it has been saved$")
    public void itWillBeCheckedThatItHasBeenSaved() {

    }

}
