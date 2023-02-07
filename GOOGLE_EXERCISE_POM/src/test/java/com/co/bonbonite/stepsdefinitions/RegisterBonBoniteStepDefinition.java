package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.RegisterData;
import com.co.bonbonite.steps.RegisterBonBoniteSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterBonBoniteStepDefinition {

    @Steps
    RegisterBonBoniteSteps registerBonBoniteSteps;

    @Given("^that he enters the website of Bonbonite$")
    public void thatHeEntersTheWebsiteOfBonbonite() {

        registerBonBoniteSteps.openPage();

    }

    @When("^he fills in the following data of the form$")
    public void heFillsInTheFollowingDataOfTheForm(List<RegisterData> registerDataList) {
        registerBonBoniteSteps.clickMyAccount();
        registerBonBoniteSteps.enterData(registerDataList.get(0).getId(),registerDataList.get(0).getEmail());
        registerBonBoniteSteps.Password(registerDataList.get(0).getPassword());
        registerBonBoniteSteps.clickButtons();


    }

    @Then("^he will be successfully registered$")
    public void heWillBeSuccessfullyRegistered() {

    }
}
