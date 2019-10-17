package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirNavegador;

public class IngresarALaPaginaInicial implements Task {
	
	private AbrirNavegador abrirNavegador;

	public static IngresarALaPaginaInicial delExtio() {
		return Tasks.instrumented(IngresarALaPaginaInicial.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(abrirNavegador));
	}

}
