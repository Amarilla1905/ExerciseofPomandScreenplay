package com.co.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("write a username").locatedBy("//input[@id='user-name' ]");
    public static final Target TXT_PASSWORD = Target.the("write a password").locatedBy("//input[@id='password' ]");
    public static final Target BTN_LOGIN = Target.the("click to login").locatedBy("//input[@id= 'login-button']' ]");
}
