package com.co.prueba.stepsdefinitions;

import com.co.prueba.models.DataLogin;
import com.co.prueba.questions.ValidationTitle;
import com.co.prueba.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinition {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp(){
        //Esta linea tiene en cuenta mi driver en variable de entorno
        OnStage.setTheStage(Cast.ofStandardActors());
        //Esta linea reemplaza the actor por el nombre, tipo Sara realizo esta u otra accion
        OnStage.theActorCalled("Sara");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));


    }


    @Given("^he user is in the web page$")
    public void heUserIsInTheWebPage() {
        //El actor esta bajo escena, en el given usamos el wasAbleTo que indica que pudo hacer algo, en este caso, abrir la url
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));

    }
    @When("the user his login")
    public void theUserHisLogin(List<DataLogin> dataLoginList) {
        DataLogin dataLogin;
        dataLogin = dataLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(dataLogin));


    }
    @Then("he user could see user")
    public void heUserCouldSeeUser() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationTitle.compareTitle()
        , (Question<Boolean>) Matchers.is(true)));

    }
}
