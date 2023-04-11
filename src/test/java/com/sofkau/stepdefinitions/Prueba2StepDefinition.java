package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Prueba2StepDefinition extends SetUp {

    @Given("wenas")
    public void wenas() {
        configurarNavegador("https://automationexercise.com/");
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );
    }

    @When("wenass")
    public void wenass() {

    }

    @Then("wenaaas")
    public void wenaaas() {

    }
}
