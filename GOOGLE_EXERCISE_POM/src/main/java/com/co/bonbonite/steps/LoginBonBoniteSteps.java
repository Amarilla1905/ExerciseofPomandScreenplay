package com.co.bonbonite.steps;

import com.co.bonbonite.page.HomeBonbonitePage;
import com.co.bonbonite.page.LoginBonBonitePage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class LoginBonBoniteSteps {
    LoginBonBonitePage loginBonBonitePage;
    HomeBonbonitePage homeBonbonitePage;

    @Step
    public void openPage(){
        loginBonBonitePage.open();
    }
    @Step
    public void clickMyAccount(){
        homeBonbonitePage.getDriver().findElement(homeBonbonitePage.getBTN_ACCOUNT()).click();
    }

    @Step
    public void enterDataLogin(String id, String password){
        loginBonBonitePage.getDriver().findElement(loginBonBonitePage.getTXT_ID_LOGIN()).click();
        loginBonBonitePage.getDriver().findElement(loginBonBonitePage.getTXT_ID_LOGIN()).sendKeys(id);
        loginBonBonitePage.getDriver().findElement(loginBonBonitePage.getTXT_PASSWORD_LOGIN()).click();
        loginBonBonitePage.getDriver().findElement(loginBonBonitePage.getTXT_PASSWORD_LOGIN()).sendKeys(password);

    }

    @Step
    public void clickLogin(){
        loginBonBonitePage.getDriver().findElement(loginBonBonitePage.getBTN_LOGIN()).click();
    }


    @Step
    public void textVerify(){
        Assert.assertThat(loginBonBonitePage.getDriver().findElement(loginBonBonitePage.getTXT_VERIFICATION())
                .isDisplayed(), Matchers.is(true));
    }



}
