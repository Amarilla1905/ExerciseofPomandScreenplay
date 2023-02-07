package com.co.conduit.userintefaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_SIGN_IN = Target.the("").locatedBy("//a[@href='/login']");
    public static final Target TXT_EMAIL_LOGIN = Target.the("").locatedBy("//input[@formcontrolname='email']");
    public static final Target TXT_PASSWORD_LOGIN = Target.the("").locatedBy("//input[@formcontrolname='password']");
    public static final Target BTN_LOGIN = Target.the("").locatedBy("//button[@class='btn btn-lg btn-primary pull-xs-right']");

}
