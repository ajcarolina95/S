package tasks;

import interactions.MoverMouse;
import interactions.RecorrerLista;
import model.ExitoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.BuscarProductoPage.*;

public class BuscarProducto implements Task {

    private List<ExitoData> exitoData;

    public BuscarProducto(List<ExitoData> exitoData) {
        this.exitoData = exitoData;
    }

    public static BuscarProducto enElMenu (List<ExitoData>exitoData){
        return Tasks.instrumented(BuscarProducto.class,exitoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_OPCION_DEL_MENU,isVisible()).forNoMoreThan(10).seconds(),
                MoverMouse.aElemento(SELECCIONAR_OPCION_DEL_MENU,MENU_ELECTRODOMESTICOS,exitoData.get(0).getProducto()),
                WaitUntil.the(SELECCIONAR_TIPO_ELECTRODOMESTICO,isVisible()).forNoMoreThan(10).seconds(),
                RecorrerLista.deElementos(SELECCIONAR_TIPO_ELECTRODOMESTICO,exitoData.get(0).getTipoDeElectrodomestico())
                );
    }
}
