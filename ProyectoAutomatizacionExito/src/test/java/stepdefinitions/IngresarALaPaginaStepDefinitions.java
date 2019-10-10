package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import tasks.IngresarALaPaginaInicial;
import userinterface.AbrirNavegador;



public class IngresarALaPaginaStepDefinitions {
	
	@Before 
	public void inicio() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	   @Dado("^que (.*) abre el navegador$")
	   public void queCarolinaAbreElNavegador(String actor) {
		   OnStage.theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExtio());
	      }

	   @Cuando("^Carolina ingresa el link del exito$")
	   public void carolinaIngresaElLinkDelExito() {
	 
	   }

		@Entonces("^debería visualizar la pagina de inicio$")
		public void deberiaVisualizarLaPaginaDeInicio() {
		}

}
