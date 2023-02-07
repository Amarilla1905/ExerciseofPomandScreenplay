package co.com.conduit.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageComponents {


    public static final Target BTN_SIGNUP = Target.the("").locatedBy("//a[text()=' Sign up ']");
    public static final Target TXT_USERNAME = Target.the("").locatedBy("//input[@formcontrolname='username']");
    public static final Target TXT_EMAIL = Target.the("").locatedBy("//input[@formcontrolname='email']");
    public static final Target TXT_PASSWORD = Target.the("").locatedBy("//input[@formcontrolname='password']");
    public static final Target BTN_SUBMIT_REGISTER = Target.the("").locatedBy("//button[@class='btn btn-lg btn-primary pull-xs-right']");
}
