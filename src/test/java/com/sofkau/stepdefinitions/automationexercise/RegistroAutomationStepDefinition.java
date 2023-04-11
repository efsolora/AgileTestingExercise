package com.sofkau.stepdefinitions.automationexercise;

import com.github.javafaker.Faker;
import com.sofkau.questions.ConsultaDeMensajes;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.automationexercise.IniciarRegistro.iniciarRegistro;
import static com.sofkau.tasks.automationexercise.LlenarRegistro.llenarRegistro;
import static com.sofkau.tasks.automationexercise.NavegarAlSetUpLogin.navegarAlSetUpLogin;
import static com.sofkau.ui.automationexercise.PaginaConfirmacionRegistro.MENSAJE_CONFIRMACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroAutomationStepDefinition extends SetUp {
    Faker faker = new Faker();
    public static Logger LOGGER= Logger.getLogger(RegistroAutomationStepDefinition.class);
    private String nameUser = faker.name().username();
    private String password = faker.numerify("#######");
    private String email = faker.internet().emailAddress();
    @Given("que el usuario esta en la pagina de inicioo")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaInicial()
                        .conLaPagina("https://automationexercise.com/")
        );
    }

    @When("navega hasta la el formulario de registro")
    public void navegaHastaLaElFormularioDeRegistro() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAlSetUpLogin()
            );
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }
    @When("Llena todos los campos")
    public void llenaTodosLosCampos() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarRegistro()
                            .conElUsuario(nameUser)
                            .yConElEmail(email)
            );
            theActorInTheSpotlight().attemptsTo(
                    llenarRegistro()
                            .conElGenero("Hombre")
                            .laContrasenna(password)
                            .elDia(String.valueOf(faker.number().numberBetween(1, 28)))
                            .elMonth(String.valueOf(faker.number().numberBetween(1, 12)))
                            .elYear(String.valueOf(faker.number().numberBetween(1975, 2005)))
                            .elFirstName(faker.name().firstName())
                            .elLastName(faker.name().lastName())
                            .laCompany(faker.company().name())
                            .laAddress(faker.address().streetAddress())
                            .laAddress2(faker.address().streetAddress())
                            .elPais("Israel")
                            .elEstado(faker.country().name())
                            .laciudad(faker.country().name())
                            .elZipCode(faker.numerify("######"))
                            .yElNumeroCelular(faker.numerify("##########"))
            );
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }
    @Then("El usuario vera un mensaje de creacion exitosa")
    public void elUsuarioVeraUnMensajeDeCreacionExitosa() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(ConsultaDeMensajes.isEqualTo(MENSAJE_CONFIRMACION), equalTo("ACCOUNT CREATED!"))
            );
            quitarDriver();
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }
}
