package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPago extends PageObject {
    public static Target TITULO = Target.the("Resumen de compra")
            .located(By.xpath("//h2[text()='Resumen de la compra']"));

    public static Target TOTAL = Target.the("Cantidad total")
            .located(By.xpath("(//td[text()='Total']/following-sibling::td[@data-bind='text: totalLabel'])[2]"));
}