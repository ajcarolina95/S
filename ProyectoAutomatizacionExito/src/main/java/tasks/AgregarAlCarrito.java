package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterface.ProductoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.NeverasPage.*;

public class AgregarAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(AGREGAR_CARRITO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AGREGAR_CARRITO));
    }

    public static AgregarAlCarrito EnLaPagina() {
        return Tasks.instrumented(AgregarAlCarrito.class);
    }
}
