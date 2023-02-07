package com.co.prueba.tasks;

import com.co.prueba.models.DataLogin;
import com.co.prueba.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    DataLogin dataLogin;

    public Login(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataLogin.getUser()).into(LoginPage.TXT_USERNAME));
        Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD);
        Click.on(LoginPage.BTN_LOGIN);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }


    }
    //instanciando la clase, estoy diciendo que cuando llamen a Login enter se va a retornar las lineas ingresadas arriba
    public static Login enter(DataLogin dataLogin){
        return Tasks.instrumented(Login.class,dataLogin);

    }
}
