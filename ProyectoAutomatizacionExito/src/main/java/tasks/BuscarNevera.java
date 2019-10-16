package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterface.NeverasPage.*;
import static userinterface.ElectrodomesticosPage.*;
import static userinterface.PrincipalPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarNevera implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(WaitUntil.the(ELECTRODOMESTICOS, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on(ELECTRODOMESTICOS),
                         WaitUntil.the(NEVERAS, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on(NEVERAS),
                         WaitUntil.the(NO_FROST, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on(NO_FROST),
                         WaitUntil.the(TIPO_EUROPEO, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on(TIPO_EUROPEO),
                         WaitUntil.the(SAMSUNG, isVisible()).forNoMoreThan(10).seconds(),
                         Click.on(SAMSUNG));
    }

    public static BuscarNevera EnLaPagina() {
        return Tasks.instrumented(BuscarNevera.class);
    }
}
