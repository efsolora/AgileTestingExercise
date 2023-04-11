package com.sofkau.ui.falabella;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesion extends PageObject {

    public static final Target BOTON_MICUENTA = Target.the("Boton ir al registro")
            .located(By.xpath("(//p[@class='UserInfo-module_my-account-label__2jIkT'])[1]"));
    public static final Target EMAIL = Target.the("input email")
            .located(By.xpath("//input[@id='testId-cc-login-form-email-input']"));
    public static final Target PASS = Target.the("input email")
            .located(By.xpath("//input[@id='testId-cc-login-form-password-input']"));
    public static final Target BOTON_INGRESAR = Target.the("input email")
            .located(By.xpath("//*[@id=\"testId-cc-login-form-submit\"]"));
}
