package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.AccountPage.DELIVERY_METHOD;


public class GoToAddress implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DELIVERY_METHOD)
        );
    }

    public static GoToAddress goToAddress() {
        return new GoToAddress();
    }
}