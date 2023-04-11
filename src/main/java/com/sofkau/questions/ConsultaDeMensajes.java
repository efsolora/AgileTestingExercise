package com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ConsultaDeMensajes {
    public static Question<String> isEqualTo(Target webElement){
        return TheTarget.textOf(webElement);
    }
    private ConsultaDeMensajes(){
    }
}
