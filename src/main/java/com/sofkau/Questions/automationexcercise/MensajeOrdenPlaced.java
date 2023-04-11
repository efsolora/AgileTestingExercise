package com.sofkau.Questions.automationexcercise;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.automationexcercise.ConfirmarCompra.MENSAJE_ORDER;

public class MensajeOrdenPlaced implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_ORDER.resolveFor(actor).getText();
    }

    public static MensajeOrdenPlaced mensajeOrdenPlaced(){
        return new MensajeOrdenPlaced();
    }
}

