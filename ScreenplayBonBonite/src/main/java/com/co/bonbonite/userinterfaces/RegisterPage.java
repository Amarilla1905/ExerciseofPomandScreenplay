package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_ID = Target.the("Enter the identification").locatedBy("//div[@class = 'myaccount' ]");
    public static final Target TXT_EMAIL = Target.the("Enter the email").locatedBy("//input[@id='reg_email']");
    public static final Target TXT_PASSWORD = Target.the("Enter the password").locatedBy("//input[@id='reg_password']");
    public static final Target CHB_INFORMATION = Target.the("Enter the password").locatedBy("//input[@id='newsletter_authorization']");
    public static final Target CHB_AUTHORIZATION = Target.the("Enter the password").locatedBy("//input[@id='privacy_policy_reg']");
    public static final Target BTN_REGISTER_SUCCESS = Target.the("Enter the password").locatedBy("//button[normalize-space()='Registrarse']");
}
