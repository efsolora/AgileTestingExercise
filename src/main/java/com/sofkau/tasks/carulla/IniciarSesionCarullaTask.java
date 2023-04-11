package com.sofkau.tasks.carulla;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.carulla.IniciarSesionCarullaUI.*;

public class IniciarSesionCarullaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Dotenv dotenv = Dotenv.configure().load();
        String usuario = dotenv.get("EMAIL");
        String contrasenna = dotenv.get("PASSWORD");
        actor.attemptsTo(
                Click.on(BOTON_INGRESAR),
                Click.on(INGRESAR_CON_CAMPO_CONTRASENA),
                Click.on(CAMPO_EMAIL),
                Enter.theValue(usuario).into(CAMPO_EMAIL),
                Click.on(CAMPO_CONTRASENNA),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesionCarullaTask iniciarSesionCarullaTask(){return new IniciarSesionCarullaTask();
    }
}
