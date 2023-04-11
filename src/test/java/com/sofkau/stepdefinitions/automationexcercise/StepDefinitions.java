package com.sofkau.stepdefinitions.automationexcercise;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.logging.Logger;

import static com.sofkau.Questions.automationexcercise.MensajeOrdenPlaced.mensajeOrdenPlaced;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.automationexcercise.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.automationexcercise.RealizarCompra.realizarCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((StepDefinitions.class)));

    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaInicial()
                        .conLaPagina("https://www.automationexercise.com/")
        );
    }
    @When("inicia sesion y completa los campos necesarios para realizar la compra")
    public void iniciaSesionYCompletaLosCamposNecesariosParaRealizarLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("james.munoz@gmail.com")
                        .yConLaContrasenna("12345678"),
                realizarCompra()
        );
    }
    @Then("el usuario debe ver un mensaje de confirmacion de la compra")
    public void elUsuarioDebeVerUnMensajeDeConfirmacionDeLaCompra() {
        LOGGER.info("Verificando que el usuario vea un mensaje de confirmacion de compra");
        theActorInTheSpotlight().should(
                seeThat(mensajeOrdenPlaced(), equalTo("ORDER PLACED!"))
        );
        LOGGER.info("Mensaje de confirmacion de compra verificado correctamente");
        quitarDriver();
        LOGGER.info("Driver quitado");
    }
}




