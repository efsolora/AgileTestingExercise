package com.sofkau.questions.exito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.exito.PaginaCarrito.MENSAJE_FINAL;

public class MensajeFinalizarCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_FINAL.resolveFor(actor).getText();
    }

    public static MensajeFinalizarCompra mensajeFinalizarCompra(){
        return new MensajeFinalizarCompra();
    }
}
