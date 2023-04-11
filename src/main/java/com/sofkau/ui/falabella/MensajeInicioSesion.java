package com.sofkau.ui.falabella;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MensajeInicioSesion extends PageObject {

    public static final Target MSJ_INICIO_SESION = Target.the("Mensaje inicio sesion")
            .located(By.xpath("(//p[@class='UserInfo-module_display1__2Gd_k UserInfo-module_label-primary__1T6Pd'])[1]"));

}
