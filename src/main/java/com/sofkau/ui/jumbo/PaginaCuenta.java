package com.sofkau.ui.jumbo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCuenta extends PageObject {
    public static Target POP_UP = Target.the("Boton ahora no")
            .located(By.xpath("//*[text()='Ahora no']"));

    public static Target EMAIL = Target.the("Campo email")
            .located(By.xpath("//*[@placeholder='Ej.: ejemplo@mail.com']"));

    public static Target CONTRASENNA = Target.the("Campo contrasenna")
            .located(By.xpath("//*[@placeholder='Ingrese su contrase\u00f1a ']"));

    public static Target ENTER_BTTN = Target.the("Boton enter")
            .located(By.xpath("//span[text()='Entrar']/ancestor::button[@type='submit']"));

    public static Target EMAIL_INICIADO  = Target.the("Usuario email")
            .located(By.xpath("//label[text()='E-mail']/following-sibling::div[contains(text(),'@gmail.com')]"));

    public static Target CAJA_BUSQUEDA = Target.the("Caja de busqueda")
            .located(By.xpath("//input[@placeholder='\u00BFQu\u00E9 est\u00E1s buscando?']"));

    public static Target METODO_ENVIO = Target.the("Seleccionar metodo de envio")
            .located(By.xpath("(//div[contains(@class,'tiendasjumboqaio-delivery-modal-3-x-containerTrigger')])[2]"));

    public static Target DEPARTAMENTO = Target.the("Campo departamento")
            .located(By.xpath("//div[text()='Departamento']"));

    public static Target E_DEPARTAMENTO = Target.the("Departamento elegido")
            .located(By.xpath("//div[text()='ANTIOQUIA']"));

    public static Target CIUDAD = Target.the("Campo ciudad")
            .located(By.xpath("//div[text()='Ciudad']"));

    public static Target E_CIUDAD = Target.the("Ciudad elegida")
            .located(By.xpath("//div[text()='Medell\u00EDn']"));

    public static Target DIRECCION = Target.the("Campo direccion")
            .located(By.xpath("//input[@placeholder='Direcci\u00F3n']"));

    public static Target CONFIRMAR_BTTN = Target.the("Boton confirmar")
            .located(By.xpath("//div[text()='Confirmar']/parent::button[@type='button']"));
}