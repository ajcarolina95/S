package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirNavegador;

public class IngresarALaPaginaInicial implements Task {

	private AbrirNavegador abrirNavegador;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(abrirNavegador));
	}
	
	public static IngresarALaPaginaInicial delExito() {
		return instrumented(IngresarALaPaginaInicial.class);
	}

}
