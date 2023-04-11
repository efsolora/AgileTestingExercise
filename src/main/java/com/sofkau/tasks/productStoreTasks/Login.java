package com.sofkau.tasks.productStoreTasks;

import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.productStoreUI.PaginaPrincipal.*;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN),
                Enter.theValue("Pedrito").into(CAMPO_USERNAME),
                Enter.theValue("pedrito123").into(CAMPO_CONTRASENIA),
                Click.on(BOTON_LOGIN)
        );
    }

    public static Login login(){
        return new Login();
    }
}
