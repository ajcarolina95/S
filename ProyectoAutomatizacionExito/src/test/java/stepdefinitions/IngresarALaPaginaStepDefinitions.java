package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ProductoAnnadido;
import tasks.ComprarProducto;
import tasks.IngresarALaPaginaInicial;

public class IngresarALaPaginaStepDefinitions {

	@Before
	public void inicio() {
		setTheStage(new OnlineCast());
	}

	@Dado("^que (.*) abre la pagina del exito$")
	public void queCarolinaAbreElNavegador(String actor) {
		theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExito());
	}

	@Cuando("^agrega un producto de tecnologia al carrito de compras$")
	public void agregaUnProductoDeTecnologiaAlCarritoDeCompras() {
		theActorInTheSpotlight().attemptsTo(ComprarProducto.delExito());
	}

	@Entonces("^se verifica que el producto se annadio al carrito de compras$")
	public void seVerificaQueElProductoSeAnnadioAlCarritoDeCompras(String valorTotal) {
		theActorInTheSpotlight().should(seeThat(ProductoAnnadido.alCarrito(), equalTo(valorTotal)));
		
	}
}
