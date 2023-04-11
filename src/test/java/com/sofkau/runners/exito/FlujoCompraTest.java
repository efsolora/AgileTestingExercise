package com.sofkau.runners.exito;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/flujocompraexito.feature"},
        glue = {"com.sofkau.stepdefinitions.exito"}
)
public class FlujoCompraTest {
    public void getHi(){
        System.out.println("Hi");
    }
}
