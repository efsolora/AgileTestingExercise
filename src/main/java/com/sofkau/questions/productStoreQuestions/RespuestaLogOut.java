package com.sofkau.questions.productStoreQuestions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLogOut implements Question<String> {

    public static final Target RESPUESTA_LOGOUT=Target.the("")
            .located(By.id("nava"));
    @Override
    public String answeredBy(Actor actor) {
        return RESPUESTA_LOGOUT.resolveFor(actor).getText();
    }

    public static RespuestaLogOut respuestaLogOut(){
        return new RespuestaLogOut();
    }
}
