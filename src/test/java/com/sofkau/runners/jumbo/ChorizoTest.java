package com.sofkau.runners.jumbo;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/jumbo"},
        glue = {"com.sofkau.stepdefinitions.jumbo"},
        tags = "@UnChorizo"
)
public class ChorizoTest {
}