package com.sofkau.ui.automationexercise;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConfirmacionRegistro extends PageObject {
    public static Target MENSAJE_CONFIRMACION = Target.the("mensaje de confirmacion")
            .located(By.xpath("//h2[@data-qa='account-created']//b"));
}
