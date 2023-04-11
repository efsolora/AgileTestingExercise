package com.sofkau.tasks.exito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.exito.PaginaInicialExito.*;

public class IniciarSesionExito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PERFIL),
                Click.on(BOTON_INGRESA_EMAIL_CONTRASENNA),
                Enter.theValue("esogaviria@gmail.com").into(INPUT_EMAIL),
                Click.on(INPUT_CONTRASENNA),
                Enter.theValue("12345Arri").into(INPUT_CONTRASENNA),
                Click.on(BOTON_ENTRAR)
        );
    }

    public static IniciarSesionExito iniciarSesion(){
        return new IniciarSesionExito();
    }
}
