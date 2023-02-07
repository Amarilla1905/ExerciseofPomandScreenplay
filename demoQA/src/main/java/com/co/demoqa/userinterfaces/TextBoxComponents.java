package com.co.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxComponents {

    public static final Target  TXT_FULLNAME = Target.the("").locatedBy("//input[@id='userName']");
    public static final Target  TXT_EMAIL = Target.the("").locatedBy("//input[@id='userEmail']");
    public static final Target  TXT_CURRENTADDRESS = Target.the("").locatedBy("//textarea[@id='currentAddress']");
    public static final Target  TXT_PERMANENTADREESS = Target.the("").locatedBy("//textarea[@id='permanentAddress']");
    public static final Target  BTN_SUBMIT = Target.the("").locatedBy("//button[@id='submit']");


}
