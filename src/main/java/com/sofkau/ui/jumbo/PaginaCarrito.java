package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarrito extends PageObject {
    public static Target TITULO_CARRITO = Target.the("Titulo carrito")
            .located(By.xpath("//p[text()='Mi Carrito']"));

    public static Target CAJA_CHECK = Target.the("Campo checkbox")
            .located(By.xpath("//span[contains(text(),'Al finalizar la compra')]"));

    public static Target PAGAR_BTTN = Target.the("Boton finalizar compra")
            .located(By.xpath("(//span[text()='Finalizar compra']/ancestor::button)[1]"));
}