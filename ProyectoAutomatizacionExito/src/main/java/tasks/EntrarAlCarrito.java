package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Task;
import static userinterface.ProductoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EntrarAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(IR_Al_CARRITO, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on());
    }

    public static AgregarAlCarrito EnLaPagina() {
        return Tasks.instrumented(AgregarAlCarrito.class);
    }

}
