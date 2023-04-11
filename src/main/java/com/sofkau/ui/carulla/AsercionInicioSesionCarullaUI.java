package com.sofkau.ui.carulla;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AsercionInicioSesionCarullaUI extends PageObject {
    public static final Target BOTON_CUENTA = Target.the("Boton Ingresar")
            .located(By.xpath("(//*[name()='svg'][@class='vtex-menu-2-x-header-link-icon '])[2]"));


    public static final Target NOMBRE_USUARIO = Target.the("Boton Ingresar")
            .located(By.xpath("(//span[@class='exito-login-4-x-userNameText'])[1]"));
}
