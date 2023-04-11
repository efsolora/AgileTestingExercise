package com.sofkau.stepdefinitions.jumbo;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.jumbo.SeHizoOrden.seHizoOrden;
import static com.sofkau.questions.jumbo.HayUnValor.hayUnValor;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.jumbo.AnnadirAlCarrito.annadirAlCarrito;
import static com.sofkau.tasks.jumbo.IrADireccion.irADireccion;
import static com.sofkau.tasks.jumbo.IrAPago.irAPago;
import static com.sofkau.tasks.jumbo.IrAIniciar.irAIniciar;
import static com.sofkau.tasks.jumbo.IrAPagar.irAPagar;
import static com.sofkau.tasks.jumbo.Iniciar.iniciar;
import static com.sofkau.tasks.jumbo.OrdenarBusqueda.ordenarBusqueda;
import static com.sofkau.tasks.jumbo.BuscarChorizo.buscarChorizo;
import static com.sofkau.tasks.jumbo.PonerDireccion.ponerDireccion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class ChorizoStepDef extends SetUp {
    private final Logger log = Logger.getLogger(ChorizoStepDef.class);

    @Given("Accedi a la pagina inicial de Jumbo")
    public void accediALaPaginaInicialDeJumbo() {
        try {
            log.info("Iniciando");
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial().conLaPagina("https://www.tiendasjumbo.co/")
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarDriver();
            Assertions.fail();
        }
    }

    @And("Inicie sesion")
    public void inicieSesion() {
        try {
            log.info("Loggeando");
            theActorInTheSpotlight().wasAbleTo(
                    irAIniciar(),
                    iniciar()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarDriver();
            Assertions.fail();
        }
    }

    @And("Seleccione mi direccion")
    public void seleccioneMiDireccion() {
        try {
            log.info("Direccion");
            theActorInTheSpotlight().wasAbleTo(
                    irADireccion(),
                    ponerDireccion()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarDriver();
            Assertions.fail();
        }
    }

    @When("Busco por Chorizo")
    public void buscoPorChorizo() {
        try {
            log.info("Buscar Chorizo");
            theActorInTheSpotlight().attemptsTo(
                    buscarChorizo(),
                    ordenarBusqueda()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarDriver();
            Assertions.fail();
        }
    }

    @And("Selecciono el Chorizo mas barato")
    public void seleccionoElChorizoMasBarato() {
        try {
            log.info("Seleccionar barato");
            theActorInTheSpotlight().attemptsTo(
                    annadirAlCarrito(),
                    irAPago(),
                    irAPagar()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarDriver();
            Assertions.fail();
        }
    }

    @Then("Sere redireccionado a la pagina de pago")
    public void sereRedireccionadoALaPaginaDePago() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(seHizoOrden(), equalTo("Resumen de la compra")),
                    seeThat(hayUnValor(), startsWith("$ "))
            );
            log.info("Test pasado");
        } catch (Exception e) {
            log.error("Test fallido");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarDriver();
            Assertions.fail();
        } finally {
            log.info("Test completado");
            quitarDriver();
        }
    }
}