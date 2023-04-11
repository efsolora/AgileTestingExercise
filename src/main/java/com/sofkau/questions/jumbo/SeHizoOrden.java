package com.sofkau.questions.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.jumbo.PaginaPago.TITULO;


public class SeHizoOrden implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TITULO.resolveFor(actor).getText();
    }

    public static SeHizoOrden seHizoOrden() {
        return new SeHizoOrden();
    }
}