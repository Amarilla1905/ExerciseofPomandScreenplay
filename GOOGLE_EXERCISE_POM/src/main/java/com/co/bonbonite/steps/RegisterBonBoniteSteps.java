package com.co.bonbonite.steps;

import com.co.bonbonite.page.HomeBonbonitePage;
import com.co.bonbonite.page.RegisterBonBonitePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Keys;

public class RegisterBonBoniteSteps {
    RegisterBonBonitePage registerBonBonitePage;
    HomeBonbonitePage homeBonbonitePage;

    @Step
    public void openPage(){
        registerBonBonitePage.open();
    }
    //Creamos clases para cada paso
    @Step
    public void clickMyAccount(){
       homeBonbonitePage.getDriver().findElement(homeBonbonitePage.getBTN_ACCOUNT()).click();
    }

    @Step
    public void enterData(String id,String email){
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_ID()).click();
       registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_ID()).sendKeys(id);
       registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_EMAIL()).click();
       registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_EMAIL()).sendKeys(email);
    }


    @Step
    public void Password(String password) {
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_PASSWORD()).click();
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_PASSWORD()).sendKeys(password);
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_PASSWORD()).sendKeys(Keys.TAB);
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getTXT_PASSWORD()).sendKeys(Keys.TAB);
    }
    @Step
    public void clickButtons(){
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getCHB_INFORMATION()).click();
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getCHB_AUTHORIZATION()).click();
        registerBonBonitePage.getDriver().findElement(registerBonBonitePage.getBTN_REGISTER_SUCCESS()).click();
    }


}
