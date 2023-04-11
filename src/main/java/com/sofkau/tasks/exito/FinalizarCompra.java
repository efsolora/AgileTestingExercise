package com.sofkau.tasks.exito;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.exito.PaginaCarrito.BOTON_IR_A_PAGAR;
import static com.sofkau.ui.exito.PaginaInicial.BOTON_CARRITO;
import static com.sofkau.ui.exito.PaginaProductoFiltrado.*;

public class FinalizarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_IR_A_PAGAR)
        );
    }
    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }

}
