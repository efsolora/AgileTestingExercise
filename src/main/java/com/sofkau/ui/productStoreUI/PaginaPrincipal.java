package com.sofkau.ui.productStoreUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public static final Target LOGIN=Target.the("Login")
            .located(By.id("login2"));

    public static final Target CAMPO_USERNAME=Target.the("")
            .located(By.id("loginusername"));

    public static final Target CAMPO_CONTRASENIA=Target.the("")
            .located(By.id("loginpassword"));

    public static final Target BOTON_LOGIN=Target.the("")
            .located(By.cssSelector("button[onclick='logIn()']"));

    public static final Target LOGOUT=Target.the("")
            .located(By.id("logout2"));


}
