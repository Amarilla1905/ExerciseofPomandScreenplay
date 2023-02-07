package co.com.conduit.tasks;

import co.com.conduit.userinterfaces.RegisterPageComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterPageTask implements Task {


    private String username=System.getProperty("username");
    private String email=System.getProperty("email");
    private String password=System.getProperty("password");


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPageComponents.BTN_SIGNUP));
        actor.attemptsTo(Enter.theValue(username).into(RegisterPageComponents.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(email).into(RegisterPageComponents.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(password).into(RegisterPageComponents.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPageComponents.BTN_SUBMIT_REGISTER));




    }

    public static RegisterPageTask registerPage(){

        return Tasks.instrumented (RegisterPageTask.class);
    }
}
