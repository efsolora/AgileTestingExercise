package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.sofkau.tasks.AbrirPaginaInicial.abrirPaginaInicial;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Prueba1StepDefinition extends SetUp {



    @Given("ola")
    public void ola() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                abrirPaginaInicial()
                        .conLaPagina("https://www.google.com/")
        );
    }

    @When("olaa")
    public void olaa() {

    }

    @Then("olaaa")
    public void olaaa() {

    }
}
