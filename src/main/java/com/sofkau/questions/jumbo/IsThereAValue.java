package com.sofkau.questions.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.jumbo.CheckoutPage.TOTAL;

public class IsThereAValue implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TOTAL.resolveFor(actor).getText();
    }

    public static IsThereAValue isThereAValue() {
        return new IsThereAValue();
    }
}