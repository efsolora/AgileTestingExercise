package com.sofkau.stepdefinitions.automationexercise;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;

import static com.sofkau.questions.automationexercise.MensajeNombre.mensajeNombre;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.automationexercise.IniciarSesion.iniciarSesion;
import static com.sofkau.util.LecturaFileProperties.getUserPasword;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static com.sofkau.util.LecturaFileProperties.getUserPasword;

public class InicioDeSesionAutomationExerciseStepDefinition extends SetUp {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((InicioDeSesionAutomationExerciseStepDefinition.class)));

private List<String> credenciales = getUserPasword();

    public InicioDeSesionAutomationExerciseStepDefinition() throws IOException {
    }

    @Given("que el usuario se encuentra en la pagina incial de automation exercise")
    public void que_el_usuario_se_encuentra_en_la_pagina_incial_de_automation_exercise(){

        try {
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial()
                            .conLaPagina("https://www.automationexercise.com/login")
            );

        } catch (Exception e) {
            LOGGER.info("Fallo al momento de configurar el navegador");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }


    }



    @When("el usuario ingresa con sus credenciales")
    public void el_usuario_ingresa_con_sus_credenciales() {
           try {
                theActorInTheSpotlight().attemptsTo(
                        iniciarSesion()
                                .conElUsuario(credenciales.get(0))
                                .yConLaContrasenna(credenciales.get(1))
                );
            } catch (Exception e) {
                LOGGER.info("Fallo al momento de hacer el login");
                LOGGER.warn(e.getMessage());
                Assertions.fail();
                quitarDriver();

        }
    }



    @Then("El usuario deberia ver su nombre en la pagina principal a la cual es redirigido")
    public void el_usuario_deberia_ver_su_nombre_en_la_pagina_principal_a_la_cual_es_redirigido() {


        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeNombre(), equalTo("Logged in as Juan Esteban"))
            );
        } catch (Exception e) {
            LOGGER.info("Fallo al momento de verificar el mensaje de nombre");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

}
