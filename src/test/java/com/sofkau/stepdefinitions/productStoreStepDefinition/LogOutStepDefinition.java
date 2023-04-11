package com.sofkau.stepdefinitions.productStoreStepDefinition;

import com.jcraft.jsch.Logger;
import com.sofkau.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.productStoreQuestions.RespuestaLogOut.respuestaLogOut;
import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.productStoreTasks.LogOut.logOut;
import static com.sofkau.tasks.productStoreTasks.Login.login;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
public class LogOutStepDefinition extends SetUp {

    @Given("que el usuario esta en la pagina principal")
    public void queElUsuarioEstaEnLaPaginaPrincipal() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial()
                            .conLaPagina("https://www.demoblaze.com/index.html")
            );
        }catch (Exception e){

        }

    }

    @When("el usuario inicia sesion y presiona el boton logout")
    public void elUsuarioIniciaSesionYPresionaElBotonLogout() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    login(),
                    logOut()
            );
        }catch (Exception e){

        }

    }

    @Then("vuelve a la pagina principal")
    public void vuelveALaPaginaPrincipal() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(respuestaLogOut(),equalTo("PRODUCT STORE"))
            );
        }catch (Exception e){
            Assertions.fail();
        }
        quitarDriver();
    }
}
