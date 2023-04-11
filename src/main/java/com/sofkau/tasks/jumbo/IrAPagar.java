package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.PaginaCarrito.CAJA_CHECK;
import static com.sofkau.ui.jumbo.PaginaCarrito.PAGAR_BTTN;

public class IrAPagar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAJA_CHECK),
                Click.on(PAGAR_BTTN)
        );
    }

    public static IrAPagar irAPagar() {
        return new IrAPagar();
    }
}