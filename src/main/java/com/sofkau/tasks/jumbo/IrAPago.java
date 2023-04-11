package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.PaginaComprar.CARRITO;
import static com.sofkau.ui.jumbo.PaginaComprar.FINALIZAR_BTTN;


public class IrAPago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRITO),
                Click.on(FINALIZAR_BTTN)
        );
    }

    public static IrAPago irAPago() {
        return new IrAPago();
    }
}