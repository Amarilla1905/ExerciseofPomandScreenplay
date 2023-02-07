package co.com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormsComponents {

    public static final Target BTN_ADD = Target.the("").locatedBy("//button[@id='addNewRecordButton']");
    public static final Target TXT_FIRSTNAME = Target.the("").locatedBy("//input[@id='firstName']");
    public static final Target TXT_LASTNAME = Target.the("").locatedBy("//input[@id='lastName']");
    public static final Target TXT_EMAIL = Target.the("").locatedBy("//input[@id='userEmail']");
    public static final Target TXT_AGE = Target.the("").locatedBy("//input[@id='age']");
    public static final Target TXT_SALARY = Target.the("").locatedBy("//input[@id='salary']");
    public static final Target TXT_DEPARTMENT = Target.the("").locatedBy("//input[@id='department']");
    public static final Target BTN_SUBMIT = Target.the("").locatedBy("//button[@id='submit']");


}
