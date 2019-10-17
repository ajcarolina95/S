package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ingresar_a_la_pagina.feature",
				 tags = "@CarritoElectrodomestico",
				 glue = "stepdefinitions",
				 snippets = SnippetType.CAMELCASE)

public class IngresarALaPagina {

}
