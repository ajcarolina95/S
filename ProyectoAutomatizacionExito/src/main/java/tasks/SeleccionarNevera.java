package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterface.NeverasPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarNevera implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(NEVECON, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on(NEVECON));
    }

    public static SeleccionarNevera EnLaPagina() {
        return Tasks.instrumented(SeleccionarNevera.class);
    }
}
