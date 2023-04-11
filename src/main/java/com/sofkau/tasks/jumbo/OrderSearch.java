package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.jumbo.BuyPage.*;


public class OrderSearch implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORY),
                Click.on(SELECTED_CATEGORY),
                Click.on(ORDER_BY),
                Click.on(MINOR)
        );
    }

    public static OrderSearch orderSearch() {
        return new OrderSearch();
    }
}