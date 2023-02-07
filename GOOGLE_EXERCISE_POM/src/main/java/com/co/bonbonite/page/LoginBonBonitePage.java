package com.co.bonbonite.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bon-bonite.com/")
public class LoginBonBonitePage extends PageObject {

    By TXT_ID_LOGIN = By.xpath("//input[@id='username']");
    By TXT_PASSWORD_LOGIN = By.xpath("//input[@id='password']");
    By BTN_LOGIN = By.xpath("//button[@value= 'Acceder']");


    By TXT_VERIFICATION = By.xpath("(//strong[contains(text(),'0123456789')])[1]");

    public By getTXT_ID_LOGIN() {
        return TXT_ID_LOGIN;
    }

    public By getTXT_PASSWORD_LOGIN() {
        return TXT_PASSWORD_LOGIN;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public By getTXT_VERIFICATION() {return TXT_VERIFICATION;}



}
