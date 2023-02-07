package com.co.demoqa.stepsdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TextBoxStepDefinitions {
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
}
