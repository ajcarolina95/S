package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.ExitoData;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarProducto;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import tasks.IngresarALaPaginaInicial;
import tasks.VerCarrito;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class IngresarALaPaginaStepDefinitions {

	@Before
	public void inicio() {
		setTheStage(new OnlineCast());
	}

	@Dado("^que (.*) abre la pagina del exito$")
	public void queCarolinaAbreLaPaginaDelExito(String actor) {
		theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExtio());
	}

	@Cuando("^agrega un electrodomestico al carrito de compras$")
	public void agregaUnElectrodomesticoAlCarritoDeCompras(List<ExitoData> exitoData) {
		theActorInTheSpotlight().attemptsTo(BuscarProducto.enElMenu(exitoData));
		theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito(exitoData));
		theActorInTheSpotlight().attemptsTo(VerCarrito.deLaPagina(exitoData));
	}

	@Entonces("^verifica que el electrodomestico se encuentre en el carrito de compras$")
	public void verificaQueElElectrodomesticoSeEncuentreEnElCarritoDeCompras(List<ExitoData>exitoData) {
		//theActorInTheSpotlight().should(seeThat(VerificarProducto.enCarrito(),equalTo(exitoData.get(0).getVerificarCarrito())));
	}

	@Cuando("^compra un electrodomestico$")
	public void compraUnElectrodomestico(List<String> arg1) {

	}

	@Entonces("^verifica mensaje de compra exitosa$")
	public void verificaMensajeDeCompraExitosa() {

	}

}
