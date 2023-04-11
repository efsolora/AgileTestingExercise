package com.sofkau.ui.carulla;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IniciarSesionCarullaUI extends PageObject {

    public static final Target BOTON_INGRESAR = Target.the("Boton Ingresar")
            .located(By.xpath("(//*[name()='svg'][@class='vtex-menu-2-x-header-link-icon '])[2]"));

    public static final Target INGRESAR_CON_CAMPO_CONTRASENA = Target.the("Ingresar con campo y contrasena")
            .located(By.xpath("(//div[contains(@class,'vtex-button__label flex items-center justify-center h-100 ph6')])[3]"));
    public static final Target CAMPO_EMAIL = Target.the("Campo email")
            .located(By.xpath("(//input[contains(@placeholder,'Ingresa tu email')])[1]"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath("(//div[@class='vtex-button__label flex items-center justify-center h-100 ph5 '])[2]"));

}
