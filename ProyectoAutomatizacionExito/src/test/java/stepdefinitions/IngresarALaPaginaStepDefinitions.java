package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.IngresarALaPaginaInicial;


public class IngresarALaPaginaStepDefinitions {

    @Before
    public void inicio() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) abre la pagina del exito$")
    public void queCarolinaAbreElNavegador(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExtio());
    }


    @Cuando("^que el usurio selecciona un producto$")
    public void queElUsurioSeleccionaUnProducto() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^lo ingresa al carrito$")
    public void loIngresaAlCarrito() {
        // Write code here that turns the phrase above into concrete actions

    }
}
