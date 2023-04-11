package com.sofkau.ui.exito;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialExito extends PageObject {

    public static final Target BOTON_PERFIL = Target.the("BOTON PERFIL")
            .located(By.xpath("//div[@class='vtex-store-drawer-0-x-drawerTriggerContainer']"));
    public static final Target BOTON_INGRESA_EMAIL_CONTRASENNA = Target.the("BOTON_INGRESA_EMAIL_CONTRASENNA")
            .located(By.xpath("(//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-secondary b--action-secondary c-on-action-secondary hover-bg-action-secondary hover-b--action-secondary hover-c-on-action-secondary pointer '])[2]"));
    public static final Target INPUT_EMAIL = Target.the("INPUT EMAIL")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));
    public static final Target INPUT_CONTRASENNA = Target.the("Campo del contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_ENTRAR = Target.the("BOTON_ENTRAR")
            .located(By.xpath("(//button[@type='submit'])[2]"));//span[contains(text(),'Hola efrain')]
    public static final Target TEXTO_ASSERTION = Target.the("BOTON_ENTRAR")
            .located(By.xpath("//span[contains(text(),'Hola efrain')]"));
}
