package com.sofkau.tasks.productStoreTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.productStoreUI.PaginaPrincipal.LOGOUT;

public class LogOut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGOUT)
        );
    }

    public static LogOut logOut(){
        return new LogOut();
    }
}
