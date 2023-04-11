package com.sofkau.stepdefinitions.automationexcercise;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;


import static com.sofkau.Questions.automationexcercise.MensajeOrdenConfirmadaAE.mensajeOrdenPlaced;
import static com.sofkau.tasks.automationexcercise.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.automationexcercise.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.automationexcercise.RealizarCompra.realizarCompra;
import static com.sofkau.util.LoadCredentials.getCredentials;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions extends SetUp {

    private List<String> credenciales = getCredentials("automation");
    public static Logger LOGGER = Logger.getLogger(String.valueOf((StepDefinitions.class)));

    public StepDefinitions() throws IOException {
    }

    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial()
                            .conLaPagina("https://www.automationexercise.com/")
            );
        } catch (Exception e) {
            LOGGER.error("Error al configurar el navegador o abrir la pagina inicial: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("inicia sesion y completa los campos necesarios para realizar la compra")
    public void iniciaSesionYCompletaLosCamposNecesariosParaRealizarLaCompra() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario(credenciales.get(0))
                            .yConLaContrasenna(credenciales.get(1)),
                    realizarCompra()
            );
        } catch (Exception e) {
            LOGGER.error("Error al iniciar sesion o completar campos para la compra: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Then("el usuario debe ver un mensaje de confirmacion de la compra")
    public void elUsuarioDebeVerUnMensajeDeConfirmacionDeLaCompra() {
        try {
            LOGGER.info("Verificando que el usuario vea un mensaje de confirmacion de compra");
            theActorInTheSpotlight().should(
                    seeThat(mensajeOrdenPlaced(), equalTo("ORDER PLACED!"))
            );
            LOGGER.info("Mensaje de confirmacion de compra verificado correctamente");
            quitarDriver();
            LOGGER.info("Driver quitado");
        } catch (Exception e) {
            LOGGER.error("Error al verificar el mensaje de confirmacion de compra o quitar el driver: " + e.getMessage());
            Assertions.fail();
        } finally {
            quitarDriver();
        }
    }

}




