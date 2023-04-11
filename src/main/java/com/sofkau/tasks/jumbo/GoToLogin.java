package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.HomePage.MI_CUENTA;


public class GoToLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MI_CUENTA)
        );
    }

    public static GoToLogin goToLogin() {
        return new GoToLogin();
    }
}