package com.co.conduit.tasks;

import com.co.conduit.models.RegisterData;
import com.co.conduit.userintefaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterPageTasks implements Task {

    RegisterData registerData;

    public RegisterPageTasks(RegisterData registerData){
        this.registerData =registerData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_SIGNUP));
        actor.attemptsTo(Click.on(RegisterPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(registerData.getUsername()).into(RegisterPage.TXT_USERNAME));
        actor.attemptsTo(Click.on(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(registerData.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Click.on(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(registerData.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));

    }
    public static RegisterPageTasks enter(RegisterData registerData){

        return Tasks.instrumented(RegisterPageTasks.class, registerData);
    }

}
