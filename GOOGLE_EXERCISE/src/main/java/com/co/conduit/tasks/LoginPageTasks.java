package com.co.conduit.tasks;

import com.co.conduit.models.LoginData;
import com.co.conduit.userintefaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginPageTasks implements Task {


    public static Performable loginPageTask(LoginData loginData) {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BTN_SIGN_IN));
        actor.attemptsTo(Click.on(LoginPage.TXT_EMAIL_LOGIN));
        actor.attemptsTo(Enter.theValue(loginData().getEmail()).into(LoginPage.TXT_EMAIL_LOGIN));
        actor.attemptsTo(Click.on(LoginPage.TXT_PASSWORD_LOGIN));
        actor.attemptsTo(Enter.theValue(loginData().getPassword()).into(LoginPage.TXT_PASSWORD_LOGIN));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));

    }

    public static LoginData loginData(){
        return Tasks.instrumented(LoginPageTasks.class,loginData());

    }
}
