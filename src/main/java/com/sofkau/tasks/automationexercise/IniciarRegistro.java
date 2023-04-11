package com.sofkau.tasks.automationexercise;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.automationexercise.PaginaSinupLogin.*;

public class IniciarRegistro implements Task {
    private String nameUsuario;
    private String email;

    public IniciarRegistro conElUsuario(String usuario){
        this.nameUsuario=usuario;
        return this;
    }

    public IniciarRegistro yConElEmail(String email){
        this.email=email;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameUsuario).into(CAMPO_NAME_USER),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_REGISTRAR)
        );
    }

    public static IniciarRegistro iniciarRegistro(){
        return new IniciarRegistro();
    }
}
