package com.sofkau.runners.falabella;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/iniciosesionfalabella.feature"},
        glue = {"com.sofkau.stepdefinitions"}


)
public class IncioSesionFalabellaTest {
}
