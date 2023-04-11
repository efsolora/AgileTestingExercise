package com.sofkau.questions.carulla;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static com.sofkau.ui.carulla.AsercionInicioSesionCarullaUI.NOMBRE_USUARIO;

public class IniciarSesionCarullaQuestion {

    public static Question<String> isEqualTo(Target webElement){
        return TheTarget.textOf(webElement);
    }
    private IniciarSesionCarullaQuestion(){
    }
}
