package tasks;

import interactions.RecorrerLista;
import interactions.SeleccionarCheckbox;
import model.ExitoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.AgregarProductoPage.*;

public class AgregarProducto implements Task {

    private List<ExitoData> exitoData;

    public AgregarProducto(List<ExitoData> exitoData) {
        this.exitoData = exitoData;
    }

    public static AgregarProducto alCarrito(List<ExitoData> exitoData) {
        return Tasks.instrumented(AgregarProducto.class, exitoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCheckbox.aMarcar(exitoData.get(0).getMarcas(), "HACEB",FILTRO_TIPO_MARCA ),
                RecorrerLista.deElementos(SELECCION_DEL_PRODUCTO, exitoData.get(0).getNombreProducto()),
                Click.on(BOTON_AGREGAR_A_CARRITO)
                );
    }
}
