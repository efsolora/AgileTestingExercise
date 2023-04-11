package com.sofkau.questions.carulla;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static com.sofkau.ui.carulla.AsercionInicioSesionCarullaUI.NOMBRE_USUARIO;

public class IniciarSesionCarullaQuestion {

    private IniciarSesionCarullaQuestion(){}
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(NOMBRE_USUARIO);

    }
}
