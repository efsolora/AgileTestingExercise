package com.sofkau.stepdefinitions.exito;
import com.sofkau.questions.ConsultaDeMensajes;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static com.sofkau.questions.exito.MensajeConfirmacionExito.mensajeConfirmacion;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.exito.IniciarSesionExito.iniciarSesion;
import static com.sofkau.ui.exito.PaginaInicialExito.TEXTO_ASSERTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class InicioSesionExitoStepDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(InicioSesionExitoStepDefinitions.class);

    @Given("que el usuario esta en la pagina")
    public void que_el_usuario_esta_en_la_pagina() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial()
                            .conLaPagina("https://www.exito.com/")
            );
            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("ingresa correo y contrasenna validas")
    public void ingresa_correo_y_contrasenna_validas() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }

    @Then("se ve un mensaje con el nombre del usuario")
    public void se_ve_un_mensaje_con_el_nombre_del_usuario() {
        try {
            seeThat(ConsultaDeMensajes.isEqualTo(TEXTO_ASSERTION), equalTo("ACCOUNT CREATED!"));
            LOGGER.info("Realiza la peticion");
            LOGGER.info(mensajeConfirmacion().toString() + " = Hola efrain");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

}