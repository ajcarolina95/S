package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.IngresarALaPaginaInicial;



public class IngresarALaPaginaStepDefinitions {
	
	@Before 
	public void inicio() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	   @Dado("^que (.*) abre la pagina del exito$")
	   public void queCarolinaAbreElNavegador(String actor) {
		   OnStage.theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExito());
	      }
	  
	   @Cuando("^se selecciona un producto de tecnologia$")
	   public void seSeleccionaUnProductoDeTecnologia() {
		   
	   }

	   @Entonces("^se añade al carrito de compras$")
	   public void seAñadeAlCarritoDeCompras() {
	       
	   }
}
