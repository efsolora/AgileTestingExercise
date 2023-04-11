package com.sofkau.tasks.jumbo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.jumbo.AccountPage.SEARCH_BOX;


public class SearchChorizo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Chorizo").into(SEARCH_BOX),
                Hit.the(Keys.ENTER).into(SEARCH_BOX)
        );
    }

    public static SearchChorizo searchChorizo() {
        return new SearchChorizo();
    }
}