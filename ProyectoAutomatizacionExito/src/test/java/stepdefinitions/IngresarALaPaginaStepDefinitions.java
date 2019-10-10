package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;



public class IngresarALaPaginaStepDefinitions {
	@Managed() public WebDriver driver;

	 
	
	   @Before
	    public void before() {
	        OnStage.setTheStage(OnlineCast.ofStandardActors());
	        OnStage.theActorCalled("Carolina");
	    }
	
	@Dado("^que yo abro el navegador$")
	public void queYoAbroElNavegador() {
		OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(this.driver));
		OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn());
	}	
		
	@Cuando("^ingreso el link del exito$")
	public void ingresoElLinkDelExito() {
	}

	@Entonces("^debería visualizar la pagina de inicio$")
	public void deberiaVisualizarLaPaginaDeInicio() {
	}

}
