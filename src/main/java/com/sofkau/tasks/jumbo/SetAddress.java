package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.jumbo.AccountPage.*;


public class SetAddress implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DEPARTMENT),
                Scroll.to(E_DEPARTMENT).then(Click.on(E_DEPARTMENT)),
                Click.on(CITY),
                Scroll.to(E_CITY).then(Click.on(E_CITY)),
                Enter.theValue("Calle 1 # 1 - 1").into(ADDRESS),
                Click.on(CONFIRM_BTTN)
        );
    }

    public static SetAddress setAddress() {
        return new SetAddress();
    }
}