package com.sofkau.runners.productStoreRunners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/productStoreLogOut.feature"},
        glue = {"com.sofkau.stepdefinitions.productStoreStepDefinition"}


)
public class LogOutTest {
}
