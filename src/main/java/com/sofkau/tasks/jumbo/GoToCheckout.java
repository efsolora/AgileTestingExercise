package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.BuyPage.CART;
import static com.sofkau.ui.jumbo.BuyPage.CHECKOUT_BTTN;


public class GoToCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CART),
                Click.on(CHECKOUT_BTTN)
        );
    }

    public static GoToCheckout goToCheckout() {
        return new GoToCheckout();
    }
}