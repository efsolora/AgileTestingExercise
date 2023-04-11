package com.sofkau.runners.exito;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/iniciosesionexito.feature"},
        glue = {"com.sofkau.stepdefinitions"}
)
public class InicioSesionExitoTest {
}
