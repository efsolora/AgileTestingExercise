package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.jumbo.BuyPage.BUY_BTTN;


public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BUY_BTTN),
                Click.on(BUY_BTTN)
        );
    }

    public static AddToCart addToCart() {
        return new AddToCart();
    }
}