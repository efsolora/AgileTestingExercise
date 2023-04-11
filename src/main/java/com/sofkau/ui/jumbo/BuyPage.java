package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyPage extends PageObject {
    public static Target CATEGORY = Target.the("Category section")
            .located(By.xpath("(//div[@class='vtex-search-result-3-x-filterTitle f5 flex items-center justify-between'])[3]"));

    public static Target SELECTED_CATEGORY = Target.the("Lácteos, Huevos Y Refrigerados category")
            .located(By.xpath("//label[text()='L\u00E1cteos, Huevos Y Refrigerados']/parent::div"));

    public static Target ORDER_BY = Target.the("Order by button")
            .located(By.xpath("//span[text()='Ordenar por']/ancestor::button"));

    public static Target MINOR = Target.the("Lower price order")
            .located(By.xpath("//button[text()='Menor precio']"));

    public static Target BUY_BTTN = Target.the("Lower price Chorizo buy button")
            .located(By.xpath("(//span[text()='Comprar']/ancestor::button)[1]"));

    public static Target SEARCH = Target.the("Search route")
            .located(By.xpath("//div[@data-testid='breadcrumb']"));

    public static Target CART = Target.the("Cart button")
            .located(By.xpath("(//div[@role='presentation'])[1]"));

    public static Target CHECKOUT_BTTN = Target.the("Finalize purchase button")
            .located(By.xpath("//span[text()='FINALIZAR COMPRA']"));
}