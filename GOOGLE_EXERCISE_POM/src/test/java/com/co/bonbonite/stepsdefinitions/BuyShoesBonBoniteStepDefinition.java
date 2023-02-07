package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.steps.LoginBonBoniteSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BuyShoesBonBoniteStepDefinition {


    @Steps
    LoginBonBoniteSteps loginBonBoniteSteps;







    @Given("^that the user enters the website$")
    public void thatTheUserEntersTheWebsite() {

    }

    @When("^the user chooses some product from the shoes category and adds it to the shopping cart$")
    public void theUserChoosesSomeProductFromTheShoesCategoryAndAddsItToTheShoppingCart() {

    }

    @Then("^the product is successfully added to the shopping cart$")
    public void theProductIsSuccessfullyAddedToTheShoppingCart() {

    }
}
