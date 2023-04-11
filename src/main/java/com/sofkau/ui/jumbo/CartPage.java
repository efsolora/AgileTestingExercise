package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static Target CART_TITLE = Target.the("Cart title")
            .located(By.xpath("//p[text()='Mi Carrito']"));

    public static Target CHECKBOX = Target.the("Checkbox field")
            .located(By.xpath("//span[contains(text(),'Al finalizar la compra')]"));

    public static Target CHECKOUT_BTTN = Target.the("Finalize purchase button")
            .located(By.xpath("(//span[text()='Finalizar compra']/ancestor::button)[1]"));
}