package tasks;

import interactions.BuscarElemento;
import model.ExitoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WithTimeout;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.VerCarritoPage.*;

public class VerCarrito implements Task {

    private List<ExitoData> exitoData;

    public VerCarrito(List<ExitoData> exitoData) {
        this.exitoData = exitoData;
    }

    public static VerCarrito deLaPagina (List<ExitoData>exitoData){
        return Tasks.instrumented(VerCarrito.class,exitoData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    MoveMouse.to(MENU_BOTON_AGREGAR_CARRITO),
                    //BuscarElemento.deLaPagina("//*/div[contains(@class,'exito-header-2-x-minicartInner')]",MENU_BOTON_AGREGAR_CARRITO)
                    Click.on(MENU_BOTON_AGREGAR_CARRITO)
            );
    }
}
