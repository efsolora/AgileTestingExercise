package com.sofkau.ui.automationexercise;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaInicial extends PageObject {
    public static final Target BOTON_SINGUP_LOGIN = Target.the("Boton ir al registro y el Login")
            .located(By.xpath("//*[@href='/login']"));

}
