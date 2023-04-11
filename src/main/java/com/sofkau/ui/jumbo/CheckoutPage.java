package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public static Target TITLE = Target.the("Purchase summary")
            .located(By.xpath("//h2[text()='Resumen de la compra']"));

    public static Target TOTAL = Target.the("Total amount")
            .located(By.xpath("(//td[text()='Total']/following-sibling::td[@data-bind='text: totalLabel'])[2]"));
}