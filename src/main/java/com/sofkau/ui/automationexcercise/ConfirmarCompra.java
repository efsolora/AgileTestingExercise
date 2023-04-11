package com.sofkau.ui.automationexcercise;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmarCompra extends PageObject {

    public static Target MENSAJE_ORDER = Target.the("mensaje con el nombre")
            .located(By.xpath("(//b)[2]"));
}
