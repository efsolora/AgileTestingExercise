package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.xpath("//*[@href='/login']"));

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.xpath("//input[@data-qa='login-email']"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath("//button[@data-qa='login-button']"));



    // localizadores registro

    public static final Target CAMPO_NAME_NEW_USER = Target.the("Campo nombre de registo"  )
            .located(By.xpath("(//input[@placeholder='Name'])[1]"));

    public static final Target CAMPO_EMAIL_NEW_USER = Target.the("Campo email de registo")
            .located(By.xpath("(//input[@data-qa='signup-email'])[1]"));

    public static final Target BOTON_SINGUP_NEW_USER = Target.the("Botón SingUp")
            .located(By.xpath("(//button[normalize-space()='Signup'])[1]\n"));




}
