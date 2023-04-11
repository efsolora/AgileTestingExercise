package com.sofkau.ui.automationexercise;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFormularioRegistro extends PageObject {

    public static final Target SELECTOR_MALE = Target.the("Selector de genero masculino")
            .located(By.xpath("//input[@id='id_gender1']"));

    public static final Target SELECTOR_FEMALE = Target.the("Selector de genero femenino")
            .located(By.xpath("//input[@id='id_gender2']"));

    public static final Target CAMPO_CREATE_PASSWORD = Target.the("Campo de crear contrasena")
            .located(By.xpath("//input[@data-qa='password']"));

    public static final Target SELECTOR_DAYS = Target.the("Selector de dias")
            .located(By.xpath("//select[@data-qa='days']"));

    public static final Target SELECTOR_MONTHS = Target.the("Selector de meses")
            .located(By.xpath("//select[@data-qa='months']"));

    public static final Target SELECTOR_YEARS = Target.the("Selector de annos")
            .located(By.xpath("//select[@data-qa='years']"));

    public static final Target CAMPO_FIRST_NAME = Target.the("Campo primer nombre")
            .located(By.xpath("//input[@data-qa='first_name']"));

    public static final Target CAMPO_LAST_NAME = Target.the("Campo apellido")
            .located(By.xpath("//input[@data-qa='last_name']"));

    public static final Target CAMPO_COMPANY = Target.the("Campo nombre company")
            .located(By.xpath("//input[@data-qa='company']"));

    public static final Target CAMPO_ADDRESS = Target.the("Campo direccion")
            .located(By.xpath("//input[@data-qa='address']"));

    public static final Target CAMPO_ADDRESS2 = Target.the("Campo direccion2")
            .located(By.xpath("//input[@data-qa='address2']"));

    public static final Target CAMPO_COUNTRY = Target.the("Campo nombre pais")
            .located(By.xpath("//select[@data-qa='country']"));

    public static final Target CAMPO_STATE = Target.the("Campo nombre estado")
            .located(By.xpath("//input[@data-qa='state']"));

    public static final Target CAMPO_CITY = Target.the("Campo nombre ciudad")
            .located(By.xpath("//input[@data-qa='city']"));

    public static final Target CAMPO_ZIPCODE = Target.the("Campo codigo ZIP")
            .located(By.xpath("//input[@data-qa='zipcode']"));

    public static final Target CAMPO_MOBILE_NUMBER = Target.the("Campo numero de celular")
            .located(By.xpath("//input[@data-qa='mobile_number']"));

    public static final Target BOTON_CREAR_CUENTA = Target.the("Boton crear cuenta")
            .located(By.xpath("//button[@data-qa='create-account']"));
}
