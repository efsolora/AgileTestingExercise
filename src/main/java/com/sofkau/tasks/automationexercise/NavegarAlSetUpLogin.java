package com.sofkau.tasks.automationexercise;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.automationexercise.PaginaInicial.BOTON_SINGUP_LOGIN;

public class NavegarAlSetUpLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_SINGUP_LOGIN)
        );
    }
    public static NavegarAlSetUpLogin navegarAlSetUpLogin(){
        return new NavegarAlSetUpLogin();
    }
}
