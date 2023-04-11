package com.sofkau.ui.automationexercise;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSinupLogin extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.xpath("//input[@data-qa='login-email']"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath("//button[@data-qa='login-button']"));

    public static final Target CAMPO_NAME_USER = Target.the("Campo nombre de usuario")
            .located(By.xpath("//input[@data-qa='signup-name']"));

    public static final Target CAMPO_EMAIL = Target.the("Campo email")
            .located(By.xpath("//input[@data-qa='signup-email']"));

    public static final Target BOTON_REGISTRAR = Target.the("")
            .located(By.xpath("//button[@data-qa='signup-button']"));
}
