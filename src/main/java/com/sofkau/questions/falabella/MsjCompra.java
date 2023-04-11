package com.sofkau.questions.falabella;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class MsjCompra {
    public static Question<String> isEqualTo(Target webElement){
        return TheTarget.textOf(webElement);
    }
    private MsjCompra(){
    }
}
