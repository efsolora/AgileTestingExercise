package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.PaginaInicial.MI_CUENTA;


public class IrAIniciar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MI_CUENTA)
        );
    }

    public static IrAIniciar irAIniciar() {
        return new IrAIniciar();
    }
}