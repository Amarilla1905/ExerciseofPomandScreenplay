package co.com.conduit.tasks;

import co.com.conduit.models.EnterDataLogin;
import co.com.conduit.userinterfaces.LoginPageUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginPageTask implements Task {


    EnterDataLogin enterdatalogin;
    public LoginPageTask(EnterDataLogin enterdatalogin) {
        this.enterdatalogin = enterdatalogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    //
        actor.attemptsTo(Click.on(LoginPageUserInterfaces.BTN_SIGNIN));
        actor.attemptsTo(Enter.theValue(enterdatalogin.getEmail()).into(LoginPageUserInterfaces.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(enterdatalogin.getPassword()).into(LoginPageUserInterfaces.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPageUserInterfaces.BTN_LOGIN_SIGNIN));
    }
    public static LoginPageTask loginPageTask (EnterDataLogin enterdatalogin){
        return Tasks.instrumented(LoginPageTask.class,enterdatalogin);
    }


}
