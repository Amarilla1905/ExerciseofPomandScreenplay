package com.co.bonbonite.tasks;

import com.co.bonbonite.userinterfaces.HomePage;
import com.co.bonbonite.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class RegisterTasks implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_REGISTER));
        actor.attemptsTo(Enter.theValue("1234").into(RegisterPage.TXT_ID));
        actor.attemptsTo(Enter.theValue("saracastanom19@gmail.com").into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue("123456789").into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.CHB_INFORMATION));
        actor.attemptsTo(Click.on(RegisterPage.CHB_AUTHORIZATION));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER_SUCCESS));

    }

    public static RegisterTasks enter (){
        return Tasks.instrumented(RegisterTasks.class);

    }
}
