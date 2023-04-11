package com.sofkau.questions.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.jumbo.PaginaPago.TOTAL;

public class HayUnValor implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TOTAL.resolveFor(actor).getText();
    }

    public static HayUnValor hayUnValor() {
        return new HayUnValor();
    }
}