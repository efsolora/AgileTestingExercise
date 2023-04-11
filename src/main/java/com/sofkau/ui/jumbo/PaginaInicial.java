package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static Target MI_CUENTA = Target.the("Mi cuenta")
            .located(By.xpath("//*[text()='Mi Cuenta']"));
}