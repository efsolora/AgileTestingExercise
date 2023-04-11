package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.jumbo.PaginaComprar.COMPRAR_BTTN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class AnnadirAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(COMPRAR_BTTN),
                Click.on(COMPRAR_BTTN)
        );
    }

    public static AnnadirAlCarrito annadirAlCarrito() {
        return new AnnadirAlCarrito();
    }
}