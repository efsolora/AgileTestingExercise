package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.jumbo.PaginaComprar.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class OrdenarBusqueda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORIA),
                WaitUntil.the(CATEGORIA_SELECCIONADA, isVisible()),
                Click.on(CATEGORIA_SELECCIONADA),
                WaitUntil.the(ORDENAR_POR, isVisible()),
                Click.on(ORDENAR_POR),
                WaitUntil.the(MENOR, isVisible()),
                Click.on(MENOR)
        );
    }

    public static OrdenarBusqueda ordenarBusqueda() {
        return new OrdenarBusqueda();
    }
}