package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

public class IngresarALaPaginaStepDefinitions {
	
	@Before 
	public void inicio() {
		setTheStage(new OnlineCast());
	}
	
	@Dado("^que (.*) abre la pagina del exito$")
	public void queCarolinaAbreElNavegador(String actor) {
		theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExito());
	}

	@Cuando("^busca la nevera que desea$")
	public void buscaLaNeveraQueDesea() {
		theActorInTheSpotlight().wasAbleTo(BuscarNevera.EnLaPagina(),
										   SeleccionarNevera.EnLaPagina());
	}

	@Cuando("^la agrega al carrito de compras$")
	public void laAgregaAlCarritoDeCompras() {
		theActorInTheSpotlight().wasAbleTo(AgregarAlCarrito.EnLaPagina());
	}

	@Entonces("^verifica que se haya agregado correctamente$")
	public void verificaQueSeHayaAgregadoCorrectamente() {
		theActorInTheSpotlight().wasAbleTo(EntrarAlCarrito.EnLaPagina());
	}
}
