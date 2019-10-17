package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class MoverMouse implements Interaction {

    private Target lista,xpath;
    private String opcion;

    public MoverMouse(Target lista, Target xpath, String opcion){
        this.lista = lista;
        this.xpath = xpath;
        this.opcion = opcion;
    }

    public static MoverMouse aElemento (Target lista, Target xpath, String opcion){
        return new MoverMouse(lista,xpath,opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);
        for(int i=0; i < listObjeto.size(); i++){
            if (listObjeto.get(i).getText().trim().equals(opcion)){
                actor.attemptsTo(MoveMouse.to(xpath));
                //listObjeto.get(i).click();
                break;
            }
        }

    }
}
