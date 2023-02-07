package co.com.demoqa.tasks;

import co.com.demoqa.userinterfaces.FormsComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterData implements Task {
    private String firstname=System.getProperty("firstname");
    private String lastname=System.getProperty("lastname");
    private String email=System.getProperty("email");
    private String age=System.getProperty("age");
    private String salary=System.getProperty("salary");
    private String department=System.getProperty("department");



    public static EnterData enterData() {
        return Tasks.instrumented(EnterData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormsComponents.BTN_ADD));
        actor.attemptsTo(Enter.theValue(firstname).into(FormsComponents.TXT_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(lastname).into(FormsComponents.TXT_LASTNAME));
        actor.attemptsTo(Enter.theValue(email).into(FormsComponents.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(age).into(FormsComponents.TXT_AGE));
        actor.attemptsTo(Enter.theValue(salary).into(FormsComponents.TXT_SALARY));
        actor.attemptsTo(Enter.theValue(department).into(FormsComponents.TXT_DEPARTMENT));
        actor.attemptsTo(Click.on(FormsComponents.BTN_SUBMIT));


    }
}
