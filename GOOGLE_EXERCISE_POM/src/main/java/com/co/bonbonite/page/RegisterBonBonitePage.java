package com.co.bonbonite.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bon-bonite.com/")
public class RegisterBonBonitePage extends PageObject {



    By TXT_ID = By.xpath("//input[@id='reg_username']");
    By TXT_EMAIL = By.xpath("//input[@id='reg_email']");
    By TXT_PASSWORD = By.xpath("//input[@id='reg_password']");
    By CHB_INFORMATION = By.xpath("//*[@id= 'newsletter_authorization']");
    By CHB_AUTHORIZATION = By.xpath("//*[@id='privacy_policy_reg']");
    By BTN_REGISTER_SUCCESS = By.xpath("//button[normalize-space()='Registrarse']");

    public By getTXT_ID() {
        return TXT_ID;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getCHB_INFORMATION() {
        return CHB_INFORMATION;
    }

    public By getCHB_AUTHORIZATION() {
        return CHB_AUTHORIZATION;
    }

    public By getBTN_REGISTER_SUCCESS() {
        return BTN_REGISTER_SUCCESS;
    }


}
