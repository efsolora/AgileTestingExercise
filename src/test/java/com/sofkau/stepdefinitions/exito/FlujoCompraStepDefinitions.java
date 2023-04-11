package com.sofkau.stepdefinitions.exito;

import com.sofkau.setup.SetUp;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;

import static com.sofkau.questions.exito.MensajeFinalizarCompra.mensajeFinalizarCompra;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.exito.AgregarProductoMenor.agregarProductoMenor;
import static com.sofkau.tasks.exito.FinalizarCompra.finalizarCompra;
import static com.sofkau.tasks.exito.IngresarUbicacion.ingresarUbicacion;
import static com.sofkau.tasks.exito.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.exito.NavegarAMiCuenta.navegarAMiCuenta;
import static com.sofkau.tasks.exito.RealizarBusqueda.realizarBusqueda;
import static com.sofkau.util.LoadCredentials.getCredentials;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class FlujoCompraStepDefinitions extends SetUp {

    private List<String> credentials = getCredentials("exito");
    public static Logger LOGGER = Logger.getLogger(FlujoCompraStepDefinitions.class);

    public FlujoCompraStepDefinitions() throws IOException {
    }

    @Given("Given que estoy en la pagina de exito")
    public void givenQueEstoyEnLaPaginaDeExito() {
        try {
            configurarNavegador();
            LOGGER.info("Inicio de la Automatizacion");
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial()
                            .conLaPagina("https://www.exito.com/"),
                    navegarAMiCuenta()
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("he iniciado sesion con mis credenciales")
    public void heIniciadoSesionConMisCredenciales() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario(credentials.get(0))
                            .yConLaContrasenna(credentials.get(1))
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("he agregado el producto que quiero comprar")
    public void heAgregadoElProductoQueQuieroComprar() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    realizarBusqueda().yConElProducto("Lentejas"),
                    ingresarUbicacion(),
                    agregarProductoMenor(),
                    finalizarCompra()
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @Then("se muestra el modulo para finalizar la compra")
    public void seMuestraElModuloParaFinalizarLaCompra() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeFinalizarCompra(), equalTo("Finalizar la compra"))
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            quitarDriver();
        } finally {
            quitarDriver();
        }
    }
}
