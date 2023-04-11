package com.sofkau.tasks.exito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.exito.PaginaProductoFiltrado.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class AgregarProductoMenor implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UBICATION_MESSAGE, isNotVisible()).forNoMoreThan(10).seconds(),
                Click.on(DESPLEGABLE_ORDER_BY),
                Click.on(SELECCIONAR_MENOR_PRECIO),
                Click.on(BOTON_AGREGAR_MENOR)
        );
    }
    public static AgregarProductoMenor agregarProductoMenor(){
        return new AgregarProductoMenor();
    }
}
