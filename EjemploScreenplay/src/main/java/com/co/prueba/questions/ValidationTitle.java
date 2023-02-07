package com.co.prueba.questions;


import com.co.prueba.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationTitle implements Question {


    public static String compareTitle() {
        return null;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(MainPage.LBL_NAME_PRODUCT).viewedBy(actor).asBoolean();
    }
}
