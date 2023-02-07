package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.LoginData;
import com.co.bonbonite.page.LoginBonBonitePage;
import com.co.bonbonite.steps.LoginBonBoniteSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginBonBoniteStepDefinition {


    @Steps
    LoginBonBoniteSteps loginBonBoniteSteps;

    @Given("^the user enters the bonbonite site$")
    public void theUserEntersTheBonboniteSite() {
        loginBonBoniteSteps.openPage();
    }

    @When("^the user can access the bonbonite home page$")
    public void theUserCanAccessTheBonboniteHomePage(List<LoginData> loginDataList) {

        loginBonBoniteSteps.clickMyAccount();
        loginBonBoniteSteps.enterDataLogin(loginDataList.get(0).getId(),loginDataList.get(0).getPassword());
        loginBonBoniteSteps.clickLogin();
    }

    @Then("^he will be able to verify his account$")
    public void heWillBeAbleToVerifyHisAccount() {


    }


}
