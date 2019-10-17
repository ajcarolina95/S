package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeleccionarCheckbox implements Interaction {

    private String opcion,opcionCheckBox;
    private Target mapeo;

    public SeleccionarCheckbox(String opcion, String opcionCheckBox, Target mapeo) {
        this.opcion = opcion;
        this.opcionCheckBox = opcionCheckBox;
        this.mapeo = mapeo;
    }

    public static SeleccionarCheckbox aMarcar(String opcion, String opcionCheckBox, Target mapeo){
        return Tasks.instrumented(SeleccionarCheckbox.class,opcion,opcionCheckBox,mapeo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> objetoMapeado = mapeo.resolveAllFor(actor);
            if (opcion.trim().equals(opcionCheckBox)) {
                objetoMapeado.get(0).click();
            } else {
                System.out.println("No se encontro la opcion");
            }
    }
}
