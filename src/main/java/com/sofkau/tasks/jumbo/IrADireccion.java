package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.jumbo.PaginaCuenta.METODO_ENVIO;
import static com.sofkau.ui.jumbo.PaginaCuenta.EMAIL_INICIADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class IrADireccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL_INICIADO, isVisible()),
                Click.on(METODO_ENVIO)
        );
    }

    public static IrADireccion irADireccion() {
        return new IrADireccion();
    }
}