package com.sofkau.runners.carulla;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/IniciarSesionCarulla.feature"},
        glue = {"com.sofkau.stepdefinitions.carulla"}
)
public class IniciarSesionCarullaTest {
}
