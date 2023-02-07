package co.com.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageUserInterfaces {

    public static final Target BTN_SIGNIN = Target.the("").locatedBy("//a[@href='/login']");
    public static final Target TXT_EMAIL = Target.the("").locatedBy("//input[@formcontrolname='email']");
    public static final Target TXT_PASSWORD = Target.the("").locatedBy("//input[@formcontrolname='password']");
    public static final Target BTN_LOGIN_SIGNIN = Target.the("").locatedBy("//button[contains(text(), 'Sign in')]");










}
