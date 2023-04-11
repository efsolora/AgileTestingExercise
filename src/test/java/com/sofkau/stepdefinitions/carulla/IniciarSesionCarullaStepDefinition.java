package com.sofkau.stepdefinitions.carulla;

import com.sofkau.questions.carulla.IniciarSesionCarullaQuestion;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.carulla.AsercionNombreUsuarioCarullaTask.asercionNombreUsuarioCarullaTask;
import static com.sofkau.tasks.carulla.IniciarSesionCarullaTask.iniciarSesionCarullaTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;


public class IniciarSesionCarullaStepDefinition extends SetUp {
    private final Logger log = LoggerFactory.getLogger(IniciarSesionCarullaStepDefinition.class);
    Actor actor = Actor.named("BRYAN");
    @Given("que el usuario esta en la pagina de inicio de carulla")
    public void queElUsuarioEstaEnLaPaginaDeInicioDeCarulla() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaInicial()
                        .conLaPagina("https://www.carulla.com/")
        );

    }

    @When("inicia sesion en la pagina web de carulla con su email y contrasenna validos")
    public void iniciaSesionEnLaPaginaWebDeCarullaConSuEmailYContrasennaValidos() {
        theActorInTheSpotlight().wasAbleTo(
                iniciarSesionCarullaTask(),
                asercionNombreUsuarioCarullaTask()
        );
    }

    @Then("al dar click en el boton cuenta deberia aparecer el nombre de mi usuario")
    public void alDarClickEnElBotonCuentaDeberiaAparecerElNombreDeMiUsuario() {
        try {
            actor.should(
                    GivenWhenThen.seeThat(IniciarSesionCarullaQuestion.isEqualTo(),containsString(String.format("Pablo Jaramillo")))
            );
            log.info("Se verifico la comparacion del texto");

        } catch (Exception e) {
            log.error("Error en las aserciones");
            log.error(e.getMessage());
            throw e;
        }

    }
}
