package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.jumbo.PaginaCuenta.CAJA_BUSQUEDA;


public class BuscarChorizo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Chorizo").into(CAJA_BUSQUEDA),
                Hit.the(Keys.ENTER).into(CAJA_BUSQUEDA)
        );
    }

    public static BuscarChorizo buscarChorizo() {
        return new BuscarChorizo();
    }
}