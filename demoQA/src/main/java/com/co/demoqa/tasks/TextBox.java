package com.co.demoqa.tasks;

import com.co.demoqa.models.DataTextBox;
import com.co.demoqa.userinterfaces.TextBoxComponents;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.demoqa.userinterfaces.TextBoxComponents.*;

public class TextBox implements Task {


    DataTextBox dataTextBox;

    public TextBox(DataTextBox dataTextBox) {
        this.dataTextBox = dataTextBox;
    }
    public static TextBox textBox( DataTextBox dataTextBox){
        return Tasks.instrumented(TextBox.class,dataTextBox);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(dataTextBox.getUsername()).into(TXT_FULLNAME));
        actor.attemptsTo(Enter.theValue(dataTextBox.getEmail()).into(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(dataTextBox.getPermanentaddress()).into(TXT_PERMANENTADREESS));
        actor.attemptsTo(Enter.theValue(dataTextBox.getCurrentaddress()).into(TXT_CURRENTADDRESS));



    }
}
