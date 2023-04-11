package com.sofkau.questions.automationexercise;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.automationexercise.ConfirmarCompra.MENSAJE_ORDER;

public class MensajeOrdenConfirmadaAE implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_ORDER.resolveFor(actor).getText();
    }

    public static MensajeOrdenConfirmadaAE mensajeOrdenPlaced(){
        return new MensajeOrdenConfirmadaAE();
    }
}

