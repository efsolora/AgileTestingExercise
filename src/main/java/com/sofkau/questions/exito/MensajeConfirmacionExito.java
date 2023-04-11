package com.sofkau.questions.exito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.sofkau.ui.exito.PaginaInicialExito.TEXTO_ASSERTION;

public class MensajeConfirmacionExito implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TEXTO_ASSERTION.resolveFor(actor).getText();
    }
    public static MensajeConfirmacionExito mensajeConfirmacion(){
        return new MensajeConfirmacionExito();
    }
}
