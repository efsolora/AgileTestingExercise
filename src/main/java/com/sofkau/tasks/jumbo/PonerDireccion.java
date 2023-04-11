package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.jumbo.PaginaCuenta.*;


public class PonerDireccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DEPARTAMENTO),
                Scroll.to(E_DEPARTAMENTO).then(Click.on(E_DEPARTAMENTO)),
                Click.on(CIUDAD),
                Scroll.to(E_CIUDAD).then(Click.on(E_CIUDAD)),
                Enter.theValue("Calle 1 # 1 - 1").into(DIRECCION),
                Click.on(CONFIRMAR_BTTN)
        );
    }

    public static PonerDireccion ponerDireccion() {
        return new PonerDireccion();
    }
}