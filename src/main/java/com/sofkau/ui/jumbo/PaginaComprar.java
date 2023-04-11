package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaComprar extends PageObject {
    public static Target CATEGORIA = Target.the("Seccion categoria")
            .located(By.xpath("(//div[@class='vtex-search-result-3-x-filterTitle f5 flex items-center justify-between'])[3]"));

    public static Target CATEGORIA_SELECCIONADA = Target.the("Categoria Lácteos, Huevos Y Refrigerados")
            .located(By.xpath("//label[text()='L\u00E1cteos, Huevos Y Refrigerados']/parent::div"));

    public static Target ORDENAR_POR = Target.the("Boton ordenar por")
            .located(By.xpath("//span[text()='Ordenar por']/ancestor::button"));

    public static Target MENOR = Target.the("Orden menor precio")
            .located(By.xpath("//button[text()='Menor precio']"));

    public static Target COMPRAR_BTTN = Target.the("Boton comprar chorizo menor precio")
            .located(By.xpath("(//p[text()='COMPRAR']/ancestor::div[@role='button'])[1]"));

    public static Target SEARCH = Target.the("Search route")
            .located(By.xpath("//div[@data-testid='breadcrumb']"));

    public static Target CARRITO = Target.the("Boton carrito")
            .located(By.xpath("(//div[@role='presentation'])[1]"));

    public static Target FINALIZAR_BTTN = Target.the("Boton finalizar")
            .located(By.xpath("//span[text()='FINALIZAR COMPRA']"));
}