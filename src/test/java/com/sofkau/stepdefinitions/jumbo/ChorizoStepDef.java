package com.sofkau.stepdefinitions.jumbo;

import com.sofkau.setup.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.jumbo.IsOrderDone.isOrderDone;
import static com.sofkau.questions.jumbo.IsThereAValue.isThereAValue;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.jumbo.AddToCart.addToCart;
import static com.sofkau.tasks.jumbo.GoToAddress.goToAddress;
import static com.sofkau.tasks.jumbo.GoToCheckout.goToCheckout;
import static com.sofkau.tasks.jumbo.GoToLogin.goToLogin;
import static com.sofkau.tasks.jumbo.GoToPay.goToPay;
import static com.sofkau.tasks.jumbo.Login.login;
import static com.sofkau.tasks.jumbo.OrderSearch.orderSearch;
import static com.sofkau.tasks.jumbo.SearchChorizo.searchChorizo;
import static com.sofkau.tasks.jumbo.SetAddress.setAddress;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

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
                    goToLogin(),
                    login()
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
                    goToAddress(),
                    setAddress()
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
                    searchChorizo(),
                    orderSearch()
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
                    addToCart(),
                    goToCheckout(),
                    goToPay()
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
                    seeThat(isOrderDone(), equalTo("Resumen de la compra")),
                    seeThat(isThereAValue(), startsWith("$ "))
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