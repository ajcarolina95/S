package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ComprarProducto implements Task {

	public static ComprarProducto delExito() {

		return instrumented(ComprarProducto.class);
	}

	private String articulo;

	public ComprarProducto(String articulo) {
		this.articulo = articulo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// actor.attemptsTo(WaitUntil.the(MENU_TECNOLOGIA,
		// isVisible()).forNoMoreThan(30).seconds());
		// actor.attemptsTo(Click.on(MENU_TECNOLOGIA));
		// actor.attemptsTo(Click.on(COMPUTADORES));
	}

}
