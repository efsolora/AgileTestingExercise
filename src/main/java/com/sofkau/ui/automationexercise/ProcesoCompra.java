package com.sofkau.ui.automationexercise;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProcesoCompra extends PageObject {


    public static final Target PRODUCTS = Target.the("Productos").located(By.xpath("(//a[@href='/products'])[1]"));
    public static final Target WOMEN = Target.the("Mujeres").located(By.xpath("(//a[normalize-space()='Women'])[1]"));
    public static final Target MEN = Target.the("Hombres").located(By.xpath("(//a[normalize-space()='Men'])[1]"));
    public static final Target KIDS = Target.the("Niños").located(By.xpath("(//a[normalize-space()='Kids'])[1]"));
    public static final Target DRESS = Target.the("Vestido").located(By.xpath("(//a[contains(text(),'Dress')])[1]"));
    public static final Target ADD_CART = Target.the("Agregar al carrito").located(By.xpath("(//a[@href='javascript:void();'])[3]"));
    public static final Target CONTINUE_SHOP = Target.the("Continuar comprando").located(By.xpath("(//button[@data-dismiss='modal'])[1]"));
    public static final Target T_SHIRTS = Target.the("Camisetas").located(By.xpath("(//a)[18]"));
    public static final Target DRESSES = Target.the("Vestidos").located(By.xpath("(//a)[21]"));
    public static final Target VIEW_CART = Target.the("Ver carrito").located(By.xpath("(//u)[1]"));
    public static final Target CART_ICON = Target.the("Icono del carrito").located(By.xpath("(//i)[12]"));
    public static final Target CHECKOUT = Target.the("Realizar pedido").located(By.xpath("(//a)[13]"));
    public static final Target PLACE_ORDER = Target.the("Realizar pedido").located(By.xpath("(//a[normalize-space()='Place Order'])[1]"));
    public static final Target CARD_NAME = Target.the("Nombre en la tarjeta").located(By.xpath("(//input[@data-qa='name-on-card'])[1]"));
    public static final Target CARD_NUMBER = Target.the("Número de la tarjeta").located(By.xpath("(//input[@data-qa='card-number'])[1]"));
    public static final Target CVC = Target.the("CVC").located(By.xpath("(//input[@placeholder='ex. 311'])[1]"));
    public static final Target EXPIRATION_MONTH = Target.the("Fecha de expiracion (mes)").located(By.xpath("(//input[@placeholder='MM'])[1]"));
    public static final Target EXPIRATION_YEAR = Target.the("Fecha de expiracion (año)").located(By.xpath("(//input[@placeholder='YYYY'])[1]"));
    public static final Target PAY = Target.the("Pagar").located(By.xpath("(//button[@id='submit'])[1]"));
}
